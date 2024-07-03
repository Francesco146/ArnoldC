package it.univr.arnoldc;

import it.univr.arnoldc.gen.ArnoldCParser;

import java.util.List;

/**
 * Class to represent a function in ArnoldC.
 */
public class Function {
    /**
     * List of parameters of the function.
     */
    private List<String> parameters;
    /**
     * List of statements in the function.
     */
    private List<ArnoldCParser.StatementContext> statements;

    /**
     * @param parameters List of parameters of the function.
     * @param statements List of statements in the function.
     */
    public Function(List<String> parameters, List<ArnoldCParser.StatementContext> statements) {
        this.setParameters(parameters);
        this.setStatements(statements);
    }

    /**
     * @return List of parameters of the function.
     */
    public List<String> getParameters() {
        return parameters;
    }

    /**
     * @param parameters List of parameters of the function.
     */
    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    /**
     * @return List of statements in the function.
     */
    public List<ArnoldCParser.StatementContext> getStatements() {
        return statements;
    }

    /**
     * @param statements List of statements in the function.
     */
    public void setStatements(List<ArnoldCParser.StatementContext> statements) {
        this.statements = statements;
    }
}
