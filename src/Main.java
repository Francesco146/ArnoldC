import it.univr.arnoldc.ArnoldCInterpreter;
import it.univr.arnoldc.exceptions.ErrorHandler;
import it.univr.arnoldc.exceptions.ParseErrorException;
import it.univr.arnoldc.gen.ArnoldCLexer;
import it.univr.arnoldc.gen.ArnoldCParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;
import org.apache.commons.cli.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * Main class to run the ArnoldC interpreter.
 */
public class Main {
    /**
     * Main method to run the ArnoldC interpreter. It reads the input file, parses it and interprets it.
     *
     * @param args inputFile [outputFile] [-d]
     * @throws IOException if the file is not found
     */
    public static void main(String[] args) throws IOException {
        Options options = new Options();

        Option input = new Option("i", "input", true, "input file path");
        input.setRequired(true);
        options.addOption(input);

        Option output = new Option("o", "output", true, "output file path");
        output.setRequired(false);
        options.addOption(output);

        Option debug = new Option("d", "debug", false, "enable debug mode");
        debug.setRequired(false);
        options.addOption(debug);

        CommandLineParser commandLineParser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd;

        try {
            cmd = commandLineParser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("utility-name", options);

            System.exit(1);
            return;
        }

        String inputFileName = cmd.getOptionValue("input");
        String outputFileName = cmd.getOptionValue("output");
        boolean debugMode = cmd.hasOption("debug");

        InputStream inputFile = Thread.currentThread().getContextClassLoader().getResourceAsStream(inputFileName);
        if (inputFile == null) {
            System.err.println("File not found: " + inputFileName);
            System.exit(1);
        }

        if (outputFileName != null) {
            File outputFile = new File(outputFileName);
            PrintStream printStream = new PrintStream(outputFile);
            System.setOut(printStream);
        }

        ErrorHandler errorHandler = new ErrorHandler();

        CharStream inputStream = CharStreams.fromStream(inputFile);

        ArnoldCLexer lexer = new ArnoldCLexer(inputStream);

        // hide errors from console
        lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);
        lexer.addErrorListener(errorHandler);

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ArnoldCParser parser = new ArnoldCParser(tokens);

        // hide errors from console
        parser.removeErrorListener(ConsoleErrorListener.INSTANCE);
        parser.addErrorListener(errorHandler);

        ParseTree tree = parser.main();

        if (parser.getNumberOfSyntaxErrors() > 0) {
            String errorMessage = String.join("\n", errorHandler.getErrorMessages());
            throw new ParseErrorException(errorMessage);
        }

        ArnoldCInterpreter interpreter = new ArnoldCInterpreter();

        if (debugMode) interpreter.enableDebugMode();

        interpreter.visit(tree);

        if (outputFileName != null) System.out.close();
    }
}