package io.github.maxwellnie.sqlmessenger.core.java.reflect.property;

/**
 * @author Maxwell Nie
 */
public class ValueReaderException extends RuntimeException {
    public ValueReaderException() {
    }

    public ValueReaderException(String message) {
        super(message);
    }

    public ValueReaderException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValueReaderException(Throwable cause) {
        super(cause);
    }

    public ValueReaderException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
