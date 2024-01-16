package week11.day35_polymorphism.transportationTask;

public class Audi extends Car implements AutoPilot{


    public Audi(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    @Override
    public void autoPark() {

    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void transportPeople() {

    }

    @Override
    public void start() {

    }
}
