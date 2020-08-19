package com.wenc.commdomain.exception;

/**
 * null token 错误
 *
 * @author bruce
 */
public class NullTokenException extends Exception {
    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public NullTokenException(String message) {
        super(message);
    }
}
