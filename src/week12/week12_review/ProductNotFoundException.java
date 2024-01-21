package week12.week12_review;

public class ProductNotFoundException extends RuntimeException{

    public ProductNotFoundException(){
        super("The product does not exist");
    }

    public ProductNotFoundException(String message){
        super(message);
    }
}
