package week11.week11_review.deviceTask;

public abstract class Computer  extends Device{

    public Computer(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }

    @Override
    public void turnOn() {
        System.out.println("Press the power-button to turn on the computer "+getBrand()+" "+getModel());
    }

    @Override
    public void turnOff() {
        System.out.println("Press the power-button to turn off the computer "+getBrand()+" "+getModel());
    }
}
