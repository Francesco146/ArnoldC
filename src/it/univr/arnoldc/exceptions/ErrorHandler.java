package it.univr.arnoldc.exceptions;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

/**
 * Error handler for the ArnoldC interpreter.
 */
public class ErrorHandler extends BaseErrorListener {
    /**
     * List of error messages.
     */
    private final List<String> errorMessages = new ArrayList<>();

    /**
     * @param recognizer         the parser - not used
     * @param offendingSymbol    the offending symbol - not used
     * @param line               the line number
     * @param charPositionInLine the character position in the line
     * @param msg                the error message
     * @param e                  the exception - not used
     */
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        errorMessages.add("line " + line + ":" + charPositionInLine + " " + msg);
    }

    /**
     * @return the list of error messages
     */
    public List<String> getErrorMessages() {
        return errorMessages;
    }
}