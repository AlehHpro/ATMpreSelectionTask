package customexceptions;

/**
 * Exception is thrown when not existing command is entered.
 */
public class CommandNotFoundException extends RuntimeException{
    public CommandNotFoundException(){};
    public CommandNotFoundException(String message){
        super(message);
    };
    public CommandNotFoundException(Throwable cause){
        super(cause);
    };
    public CommandNotFoundException(String message, Throwable cause){
        super(message, cause);
    };
}
