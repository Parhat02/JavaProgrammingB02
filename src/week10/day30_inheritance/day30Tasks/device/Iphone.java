package week10.day30_inheritance.day30Tasks.device;

public class Iphone extends Phone{

    public Iphone( String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Apple", model, color, size, price, hasBattery, hasPowerButton);
    }
}
