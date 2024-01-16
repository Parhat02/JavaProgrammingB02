package week10.day30_inheritance.day30Tasks.device;

public class Nokia extends Phone{

    public Nokia(String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Nokia", model, color, size, price, hasBattery, hasPowerButton);
    }

    public Nokia(String model, String size,String color, double price) {
        super("Nokia", model, size, color, price);
    }

    public void selfDefense(){
        System.out.println(getBrand() +" "+ getModel()+" can be used for self defense");
    }
}
