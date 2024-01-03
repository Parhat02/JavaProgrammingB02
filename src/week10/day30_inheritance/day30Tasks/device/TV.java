package week10.day30_inheritance.day30Tasks.device;

public class TV extends Device{

    public TV(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton);
    }

    public void channelUp(){
        System.out.println(getBrand() + " is channeling up.");
    }

    public void channelDown(){
        System.out.println(getBrand() + " is channeling Down.");
    }
}
