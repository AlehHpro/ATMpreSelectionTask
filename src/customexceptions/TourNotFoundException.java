package customexceptions;

/**
 * Exception is thrown when tour does not exist (e.g. DB is empty).
 */
public class TourNotFoundException extends RuntimeException{
    public TourNotFoundException(){};
    public TourNotFoundException(String message){
        super(message);
    };
    public TourNotFoundException(Throwable cause){
        super(cause);
    };
    public TourNotFoundException(String message, Throwable cause){
        super(message, cause);
    };
}
