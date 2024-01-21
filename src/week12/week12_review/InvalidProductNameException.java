package week12.week12_review;

public class InvalidProductNameException extends RuntimeException{

    public InvalidProductNameException() {
        super("Product name can not be set to null/empty");
    }

    public InvalidProductNameException(String message) {
        super(message);
    }
}
