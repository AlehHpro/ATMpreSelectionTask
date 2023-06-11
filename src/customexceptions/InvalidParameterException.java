package customexceptions;

/**
 * Exception is thrown when entered parameter is invalid.
 */
public class InvalidParameterException extends RuntimeException{
    public InvalidParameterException(){};
    public InvalidParameterException(String message){
        super(message);
    };
    public InvalidParameterException(Throwable cause){
        super(cause);
    };
    public InvalidParameterException(String message, Throwable cause){
        super(message, cause);
    };
}
