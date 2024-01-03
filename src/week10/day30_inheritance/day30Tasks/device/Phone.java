package week10.day30_inheritance.day30Tasks.device;

public class Phone extends Device{

    public Phone(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void call(long phoneNumber){
        System.out.println("Calling : " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("Texting to : " + phoneNumber);
    }
}
