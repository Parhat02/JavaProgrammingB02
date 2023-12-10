package week06.week6_review;

import java.util.Objects;

public class Pizza {

    public String size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping, quantity;

    public static String shape = "Circle";

    public void setInfo(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping, int quantity) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
        this.quantity = quantity;
    }

    public double calcCost(){
        double basePrice = (Objects.equals(size, "small"))? 10  :(Objects.equals(size, "medium"))? 12 : 14 ;
        double topping = (1.5 * numberOfPepperoniTopping) + (0.8 * numberOfCheeseTopping);
        double total = ( basePrice + topping ) * quantity;
        return total;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", quantity=" + quantity +
                '}';
    }
}
