package com.wenc.commdomain.exception;

/**
 * Tenant 无效异常
 *
 * @author b.v
 */
public class TenantInvalidException extends Exception {
    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public TenantInvalidException() {
        super();
    }

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param message the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public TenantInvalidException(String message) {
        super(message);
    }
}
