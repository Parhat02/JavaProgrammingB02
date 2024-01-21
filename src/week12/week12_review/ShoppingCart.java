package week12.week12_review;

import java.util.LinkedList;
import java.util.List;

public class ShoppingCart {

    private List<Product> products;

    public ShoppingCart() {
        products = new LinkedList<>(); // doubly linked list : Insertion and deletion of elements are faster
    }

    public ShoppingCart(List<Product> products) {
        this.products = products;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addToCart(Product product){ // adds the given product to the cart, if the given product is null, then throws exception
        if (product == null){
            throw new NullPointerException("Null can not be added to the shopping cart");
        }
        products.add(product);
    }

    public void addToCart(Product[] products){ // adds the given array of products to the list

        for (Product product : products) {
//            if (product == null){
//                continue;
//            }
            addToCart(product);  // throws exception if any element in the given array of products is null
        }
    }

    public void remove(String name){ // removes the given product name from the shopping cart, if the product does not exist, then throws ProductNotFoundException

        boolean containsTheProduct = false;
        for (Product product : products) { // to make sure that the product is in the shopping cart
            if (product.getName().equalsIgnoreCase(name)) {
                containsTheProduct = true;
                break;
            }
        }
            if (!containsTheProduct){
                throw new ProductNotFoundException("The product " + name + " not found in the cart");
            }else {
                products.removeIf(p -> p.getName().equalsIgnoreCase(name));
                System.out.println("The product " + name + " has been removed from the cart successfully");
            }


//        if(products.removeIf(p -> p.getName().equalsIgnoreCase(name))){ // to make sure that the product is in the shopping cart
//            System.out.println("The product " + name + " has been removed from the cart successfully");
//        }else{ // otherwise
//            throw new ProductNotFoundException("The product " + name +" not found in the cart");
//        }

    }

    public void displayCart(){ // displays all the products that are in the shopping cart
        int count = 1;
        for (Product product : products) {
            System.out.println("Product " + count++ +": ");
            System.out.println(product.getName() + " -$" + product.getPrice());
            System.out.println("--------------------------------------------------------------");
        }
    }
    @Override
    public String toString() {
        return "ShoppingCart{" +
                "products=" + products +
                '}';
    }
}
