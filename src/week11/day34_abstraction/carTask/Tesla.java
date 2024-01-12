package week11.day34_abstraction.carTask;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start() {
        System.out.println("Use voice control to start "+ getMake() +" "+getModel());
    }

    @Override
    public void drive() {
        System.out.println("Driving " + getMake());
    }
    public void autoPilot(){
        System.out.println(getMake() +" "+getModel()+" has auto pilot feature");
    }
}
