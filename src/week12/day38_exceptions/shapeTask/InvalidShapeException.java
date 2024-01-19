package week12.day38_exceptions.shapeTask;

public class InvalidShapeException extends RuntimeException{

    public InvalidShapeException(String message) {
        super(message);
    }
}
