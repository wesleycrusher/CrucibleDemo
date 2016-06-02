package main.java.exception;

/**
 * Exception to indicate that a negative value has occured.
 *
 * @author wes
 */
public class NegativeValueException extends Exception {

    public NegativeValueException(String message) {
        super(message);
    }

}
