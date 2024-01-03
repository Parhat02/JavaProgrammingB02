package week10.day30_inheritance.day30Tasks.device;

public class Desktop extends Computer{

    public Desktop(String brand, String model, String color, String size, double price, boolean hasBattery,
                   boolean hasPowerButton, boolean hasInternet, int capacity, int ram, int graphicsCard, String CPU) {
        super(brand, model, color, size, price, hasBattery, hasPowerButton, hasInternet, capacity, ram, graphicsCard, CPU);
    }
}
