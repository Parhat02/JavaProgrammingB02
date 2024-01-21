package week12.week12_review;

public class Test {

    public static void main(String[] args) {

        // throw new ProductNotFoundException();

        //   throw new ProductNotFoundException("The product you are looking for has been removed from the cart");

        //    throw new InvalidProductNameException();

        //    throw new InvalidProductNameException("This product name should not contain digits");

        //   throw new InvalidProductPriceException();

        //  throw new InvalidProductPriceException("The product' price must be less than $100");


        Product product1, product2, product3;


        try {
            product1 = new Product("TV", 2000);
        }catch (InvalidProductPriceException e){
            e.printStackTrace();
            product1 = new Product(null, 1000);
        }catch (InvalidProductNameException e){
            e.printStackTrace();
            product1 = new Product("Unknown Product", 2000);
        }catch (RuntimeException e){
            e.printStackTrace();
            product1 = new Product("Not given", 1);
        }

        /*
        if( product1.getName().equals("TV")){
            throw new InvalidProductPriceException("The maximum price of TV is 5000, but given" + product1.getPrice());
        }
*/
        System.out.println(product1);



        product2 = new Product("Laptop", 1500);


        System.out.println(product2);

    }
}
