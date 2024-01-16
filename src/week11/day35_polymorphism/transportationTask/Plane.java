package week11.day35_polymorphism.transportationTask;

import week11.day34_abstraction.animalTask.Flyable;

public abstract class Plane extends Transportation implements Flyable {


    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    public void land(){
        System.out.println("Plane "+getMake()+" "+getModel() +" is landing");
    }

    @Override
    public void fly() {
        System.out.println(getMake()+" "+getModel()+" is flying");
    }
}
