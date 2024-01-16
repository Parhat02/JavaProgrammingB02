package week10.day30_inheritance.day30Tasks.device;

public class Samsung extends Phone{

    public Samsung(String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super("Samsung", model, color, size, price, hasBattery, hasPowerButton);
    }

    public Samsung(String model, String size, String color, double price) {
        super("Samsung", model, size, color, price);
    }

    public void freeze(){
        System.out.println(getBrand() +" "+ getModel() +" freezes a lot");
    }
}
