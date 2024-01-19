package week12.day38_exceptions;

public class BreakTimeException extends RuntimeException{


    public BreakTimeException() {
        super("it is break time");
    }

    public BreakTimeException(String message) {
        super(message);
    }
}
