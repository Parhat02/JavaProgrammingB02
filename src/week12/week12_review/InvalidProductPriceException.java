package week12.week12_review;

public class InvalidProductPriceException extends RuntimeException{

    public InvalidProductPriceException() {
        super("The product can not set to negative or zero");
    }

    public InvalidProductPriceException(String message){
        super(message);
    }
}
