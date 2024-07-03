package it.univr.arnoldc.exceptions;

/**
 * Exception thrown when the parser encounters an error.
 */
public class ParseErrorException extends RuntimeException {
    /**
     * @param message the error message, will be concatenated with a prefix
     *                which comes from the original ArnoldC interpreter.
     */
    public ParseErrorException(String message) {
        super("WHAT THE FUCK DID I DO WRONG: \n" + message);
    }
}
