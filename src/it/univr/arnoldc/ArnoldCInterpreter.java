package it.univr.arnoldc;

import it.univr.arnoldc.exceptions.ParseErrorException;
import it.univr.arnoldc.gen.ArnoldCBaseVisitor;
import it.univr.arnoldc.gen.ArnoldCParser;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.IOException;
import java.util.*;
import java.util.logging.*;
import java.util.stream.Collectors;

/**
 * ArnoldC interpreter.
 */
public final class ArnoldCInterpreter extends ArnoldCBaseVisitor<String> {
    /**
     * Logger for debugging purposes
     */
    private static final Logger LOGGER = Logger.getLogger(ArnoldCInterpreter.class.getName());
    /**
     * Debug mode flag.
     */
    private static boolean DEBUG_MODE = false;
    /**
     * Log file name
     */
    private static final String LOG_FILE = "arnoldCInterpreter.log";

    /**
     * Map of variable names and their values
     */
    private Map<String, Integer> variables = new HashMap<>();
    /**
     * Map of function names and their statements and parameters
     */
    private final Map<String, Function> functions = new HashMap<>();
    /**
     * Register to store the result of operations that acts like a stack
     */
    private Integer register = 0;

    /**
     * Set debug mode to true.
     */
    public void enableDebugMode() {
        DEBUG_MODE = true;

        // configure logger
        LOGGER.setUseParentHandlers(false);
        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new SimpleFormatter());
        consoleHandler.setLevel(Level.INFO);

        try {
            Handler fileHandler = new FileHandler(LOG_FILE);
            fileHandler.setFormatter(new SimpleFormatter());
            fileHandler.setLevel(Level.ALL);
            LOGGER.addHandler(fileHandler);
        } catch (IOException e) {
            System.err.println("File logger not working." + e);
            System.exit(1);
        }
    }

    /**
     * Check if a string is a number.
     *
     * @param string string to check if it is a number
     * @return true if the string is a number, false otherwise
     */
    private boolean isNumeric(String string) {
        return string != null && string.matches("[-+]?\\d*\\.?\\d+");
    }

    /**
     * Check if a function is a non-void function.
     *
     * @param ctx Context of the function call
     * @return true if the function is a non-void function, false otherwise.
     * A non-void function is a function that has a PUTRESULT keyword.
     */
    private static boolean isNonVoidFunction(ArnoldCParser.FunctioncallContext ctx) {
        return ctx.PUTRESULT() != null;
    }

    /**
     * Get the value of a variable or a number literal.
     *
     * @param expression expression to evaluate
     * @return value of the expression, either a variable or a number
     * @throws NoSuchElementException if the variable is not found in the map
     */
    private Integer getValue(String expression) throws NoSuchElementException {
        if (variables.containsKey(expression)) { // Variable
            Integer value = variables.get(expression);
            if (DEBUG_MODE) LOGGER.log(Level.FINE, "Get value: {0} = {1}", new Object[]{expression, value});
            return value;
        }

        if (isNumeric(expression)) { // Number literal
            if (DEBUG_MODE)
                LOGGER.log(Level.FINE, "Get value: {0} = {1}", new Object[]{expression, Integer.valueOf(expression)});
            return Integer.valueOf(expression);
        }

        throw new ParseErrorException("Variable not found: " + expression);
    }

    /**
     * Unquotes a string
     *
     * @param string string surrounded by quotes
     * @return string without quotes
     */
    private String unQuoted(String string) {
        return string.substring(1, string.length() - 1);
    }

    /**
     * Wrapper method for void functions
     *
     * @param functionName name of the function to call
     * @param parameters   list of parameters to pass to the function
     */
    private void handleFunctionCall(String functionName, List<TerminalNode> parameters) {
        handleFunctionCall(functionName, parameters, null);
    }

    /**
     * Calls a function and optionally stores the result in a variable.
     *
     * @param functionName   name of the function to call
     * @param parameters     list of parameters to pass to the function
     * @param resultVariable variable to store the result of the function call, can be null
     */
    private void handleFunctionCall(String functionName, List<TerminalNode> parameters, String resultVariable) {
        if (DEBUG_MODE)
            LOGGER.log(Level.INFO, "Calling function: {0} with parameters: {1}", new Object[]{functionName, parameters});

        Function function = functions.get(functionName);

        // Save current variable state
        Map<String, Integer> currentVariables = new HashMap<>(variables);

        addParametersToVariables(parameters, function.getParameters());

        // Execute function statements
        function.getStatements().forEach(this::visit);

        // Restore previous variable state
        variables = currentVariables;

        // Retrieve the result from the function call
        if (resultVariable != null) {
            variables.put(resultVariable, register);
            if (DEBUG_MODE)
                LOGGER.log(Level.INFO, "it.univr.arnoldc.Function {0} returned {1} into variable {2}", new Object[]{functionName, register, resultVariable});
        }
    }

    /**
     * Function declaration.
     *
     * @param parameters list of parameters of the function
     * @param statements list of statements of the function
     * @return null
     */
    private String handleFunction(List<TerminalNode> parameters, List<ArnoldCParser.StatementContext> statements) {
        List<String> functionParameters = parameters
                .stream()
                .skip(1) // the first identifier is the function name
                .map(TerminalNode::getText)
                .collect(Collectors.toList());

        String functionName = parameters.getFirst().getText();
        functions.put(functionName, new Function(functionParameters, statements));

        if (DEBUG_MODE)
            LOGGER.log(Level.INFO, "Declared function: {0} with parameters: {1}", new Object[]{functionName, functionParameters});
        return null;
    }

    /**
     * Add each parameter to the variables map
     *
     * @param identifiers list of identifiers of the function
     * @param parameters  list of parameters of the function
     */
    private void addParametersToVariables(List<TerminalNode> identifiers, List<String> parameters) {
        for (int i = 0; i < parameters.size(); i++) {
            String parameterName = parameters.get(i);
            Integer parameterValue = getValue(identifiers.get(i).getText());
            variables.put(parameterName, parameterValue);
            if (DEBUG_MODE) LOGGER.log(Level.FINE, "Parameter {0} = {1}", new Object[]{parameterName, parameterValue});
        }
    }

    /**
     * Main function.
     *
     * @param ctx the parse tree to visit
     * @return null
     */
    @Override
    public String visitMain(ArnoldCParser.MainContext ctx) {
        if (DEBUG_MODE) LOGGER.info("Visiting main context");
        ctx.function_declaration().forEach(this::visit);
        ctx.statement().forEach(this::visit);
        return null;
    }

    /**
     * Void function.
     *
     * @param ctx the parse tree to visit
     * @return null
     */
    @Override
    public String visitVoidfunction(ArnoldCParser.VoidfunctionContext ctx) {
        if (DEBUG_MODE) LOGGER.log(Level.INFO, "Visiting void function: {0}", ctx.IDENTIFIER(0).getText());
        return handleFunction(ctx.IDENTIFIER(), ctx.statement());
    }

    /**
     * Non-void function.
     *
     * @param ctx the parse tree to visit
     * @return null
     */
    @Override
    public String visitNonvoidfunction(ArnoldCParser.NonvoidfunctionContext ctx) {
        if (DEBUG_MODE) LOGGER.log(Level.INFO, "Visiting non-void function: {0}", ctx.IDENTIFIER(0).getText());
        return handleFunction(ctx.IDENTIFIER(), ctx.statement());
    }

    /**
     * Declare integer variable.
     *
     * @param ctx the parse tree to visit
     * @return null
     */
    @Override
    public String visitDeclareint(ArnoldCParser.DeclareintContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();
        Integer value = Integer.valueOf(visit(ctx.expression()));
        variables.put(variableName, value);

        if (DEBUG_MODE) LOGGER.log(Level.INFO, "Declared int variable: {0} = {1}", new Object[]{variableName, value});
        return null;
    }

    /**
     * Assign variable.
     *
     * @param ctx the parse tree to visit
     * @return null
     */
    @Override
    public String visitAssignvariable(ArnoldCParser.AssignvariableContext ctx) {
        List<ArnoldCParser.OperationContext> operations = ctx.operation();
        String variableName = ctx.IDENTIFIER().getText();

        register = getValue(visit(ctx.expression()));

        operations.stream()
                .map(this::visit)
                .forEach(result -> {
                    variables.put(variableName, Integer.valueOf(result));
                    register = Integer.valueOf(result);
                    if (DEBUG_MODE)
                        LOGGER.log(Level.FINE, "Assigned variable: {0} = {1}", new Object[]{variableName, register});
                });
        return null;
    }

    /**
     * Print statement.
     *
     * @param ctx the parse tree to visit
     * @return null
     */
    @Override
    public String visitPrintstmt(ArnoldCParser.PrintstmtContext ctx) {
        if (DEBUG_MODE) LOGGER.info("Visiting print statement");
        return visit(ctx.print_stmt());
    }

    /**
     * Condition statement.
     *
     * @param ctx the parse tree to visit
     * @return null
     */
    @Override
    public String visitConditionstmt(ArnoldCParser.ConditionstmtContext ctx) {
        if (DEBUG_MODE) LOGGER.info("Visiting condition statement");
        return visit(ctx.condition_stmt());
    }

    /**
     * While loop.
     *
     * @param ctx the parse tree to visit
     * @return null
     */
    @Override
    public String visitWhilestmt(ArnoldCParser.WhilestmtContext ctx) {
        if (DEBUG_MODE) LOGGER.info("Entering while loop");
        while (getValue(visit(ctx.expression())).equals(1))
            ctx.statement().forEach(this::visit);
        if (DEBUG_MODE) LOGGER.info("Exiting while loop");
        return null;
    }

    /**
     * Function call.
     *
     * @param ctx the parse tree to visit
     * @return null
     */
    @Override
    public String visitFunctioncall(ArnoldCParser.FunctioncallContext ctx) {
        if (isNonVoidFunction(ctx)) {
            String resultVariable = ctx.IDENTIFIER(0).getText();
            String functionName = ctx.IDENTIFIER(1).getText();
            List<TerminalNode> parameters = ctx.IDENTIFIER().stream().skip(2).toList();

            handleFunctionCall(functionName, parameters, resultVariable);
        } else {
            String functionName = ctx.IDENTIFIER(0).getText();
            List<TerminalNode> parameters = ctx.IDENTIFIER().stream().skip(1).toList();
            handleFunctionCall(functionName, parameters);
        }

        return null;
    }

    /**
     * Print variable value.
     *
     * @param ctx the parse tree to visit
     * @return null
     */
    @Override
    public String visitPrintvariable(ArnoldCParser.PrintvariableContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();
        Integer value = getValue(variableName);

        if (DEBUG_MODE)
            LOGGER.log(Level.INFO, "Printing variable: {0} = {1}", new Object[]{variableName, value});

        System.out.println(value);
        return null;
    }

    /**
     * String literal.
     *
     * @param ctx the parse tree to visit
     * @return null
     */
    @Override
    public String visitPrintstring(ArnoldCParser.PrintstringContext ctx) {
        String text = unQuoted(ctx.STRING_LITERAL().getText());
        if (DEBUG_MODE) LOGGER.log(Level.INFO, "Printing string: {0}", text);
        System.out.println(text);
        return null;
    }

    /**
     * If-else statement.
     *
     * @param ctx the parse tree to visit
     * @return null
     */
    @Override
    public String visitIfelseendif(ArnoldCParser.IfelseendifContext ctx) {
        if (DEBUG_MODE) LOGGER.info("Visiting if-else statement");

        if (getValue(visit(ctx.expression())).equals(1))
            ctx.trueIf().statement().forEach(this::visit);
        else
            ctx.falseIf().statement().forEach(this::visit);

        return null;
    }

    /**
     * If statement.
     *
     * @param ctx the parse tree to visit
     * @return null
     */
    @Override
    public String visitIfendif(ArnoldCParser.IfendifContext ctx) {
        if (DEBUG_MODE) LOGGER.info("Visiting if statement");
        if (getValue(visit(ctx.expression())).equals(1))
            ctx.trueIf().statement().forEach(this::visit);
        return null;
    }

    /**
     * Variable expression.
     *
     * @param ctx the parse tree to visit
     * @return the variable name
     */
    @Override
    public String visitVarexpr(ArnoldCParser.VarexprContext ctx) {
        String variableName = ctx.IDENTIFIER().getText();
        if (DEBUG_MODE) LOGGER.log(Level.FINE, "Variable expression: {0}", variableName);
        return variableName;
    }

    /**
     * Number literal.
     *
     * @param ctx the parse tree to visit
     * @return the number literal
     */
    @Override
    public String visitNumberexpr(ArnoldCParser.NumberexprContext ctx) {
        String number = ctx.NUMBER().getText();
        if (DEBUG_MODE) LOGGER.log(Level.FINE, "Number expression: {0}", number);
        return number;
    }

    /**
     * True literal.
     *
     * @param ctx the parse tree to visit
     * @return "1" literal
     */
    @Override
    public String visitTrueexpr(ArnoldCParser.TrueexprContext ctx) {
        if (DEBUG_MODE) LOGGER.log(Level.FINE, "True expression");
        return "1";
    }

    /**
     * False literal.
     *
     * @param ctx the parse tree to visit
     * @return "0" literal
     */
    @Override
    public String visitFalseexpr(ArnoldCParser.FalseexprContext ctx) {
        if (DEBUG_MODE) LOGGER.log(Level.FINE, "False expression");
        return "0";
    }

    /**
     * Plus and minus operation.
     *
     * @param ctx the parse tree to visit
     * @return the result of the operation
     */
    @Override
    public String visitPlusMinusOp(ArnoldCParser.PlusMinusOpContext ctx) {
        Integer expressionValue = getValue(visit(ctx.expression()));
        String result;
        switch (ctx.op.getType()) {
            case ArnoldCParser.PLUSOPERATOR -> result = String.valueOf(register + expressionValue);
            case ArnoldCParser.MINUSOPERATOR -> result = String.valueOf(register - expressionValue);
            default -> result = null;
        }
        if (DEBUG_MODE) LOGGER.log(Level.FINE, "Plus/Minus operation result: {0}", result);
        return result;
    }

    /**
     * Multiplication and division operation.
     *
     * @param ctx the parse tree to visit
     * @return the result of the operation
     */
    @Override
    public String visitMulDivOp(ArnoldCParser.MulDivOpContext ctx) {
        Integer expressionValue = getValue(visit(ctx.expression()));
        String result;
        switch (ctx.op.getType()) {
            case ArnoldCParser.MULTIPLICATIONOPERATOR -> result = String.valueOf(register * expressionValue);
            case ArnoldCParser.DIVISIONOPERATOR -> result = String.valueOf(register / expressionValue);
            default -> result = null;
        }
        if (DEBUG_MODE) LOGGER.log(Level.FINE, "Mul/Div operation result: {0}", result);
        return result;
    }

    /**
     * Greater operation.
     *
     * @param ctx the parse tree to visit
     * @return "1" if the register is greater than the expression, "0" otherwise
     */
    @Override
    public String visitGreaterOp(ArnoldCParser.GreaterOpContext ctx) {
        Integer expressionValue = getValue(visit(ctx.expression()));
        String result = register > expressionValue ? "1" : "0";
        if (DEBUG_MODE) LOGGER.log(Level.FINE, "Greater operation result: {0}", result);
        return result;
    }

    /**
     * Equality operation.
     *
     * @param ctx the parse tree to visit
     * @return "1" if the register and the expression are equal, "0" otherwise
     */
    @Override
    public String visitEqualOp(ArnoldCParser.EqualOpContext ctx) {
        Integer expressionValue = getValue(visit(ctx.expression()));
        String result = Objects.equals(register, expressionValue) ? "1" : "0";
        if (DEBUG_MODE) LOGGER.log(Level.FINE, "Equal operation result: {0}", result);
        return result;
    }

    /**
     * Logical operation (AND, OR).
     *
     * @param ctx the parse tree to visit
     * @return the result of the logical operation as a string, "1" for true and "0" for false. Returns null if the operation type is not recognized.
     */
    @Override
    public String visitOrAndOp(ArnoldCParser.OrAndOpContext ctx) {
        Integer expressionValue = getValue(visit(ctx.expression()));
        String result;
        switch (ctx.op.getType()) {
            case ArnoldCParser.AND -> result = register != 0 && expressionValue != 0 ? "1" : "0";
            case ArnoldCParser.OR -> result = register != 0 || expressionValue != 0 ? "1" : "0";
            default -> result = null;
        }
        if (DEBUG_MODE) LOGGER.log(Level.FINE, "Or/And operation result: {0}", result);
        return result;
    }

    /**
     * Reads an integer from the console and stores it in a variable.
     *
     * @param ctx the parse tree to visit
     * @return null
     */
    @Override
    public String visitReadint(ArnoldCParser.ReadintContext ctx) {
        int value;
        try {
            value = Integer.parseInt(System.console().readLine());
        } catch (NumberFormatException _) {
            throw new ParseErrorException("Invalid input: expected an integer.");
        }
        String variableName = ctx.IDENTIFIER().getText();

        variables.put(variableName, value);
        if (DEBUG_MODE) LOGGER.log(Level.INFO, "Read int variable: {0} = {1}", new Object[]{variableName, value});
        return null;
    }
}
