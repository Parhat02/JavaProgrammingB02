package week06.day17_customClass;

public class Car {

    String make;
    String model;
    int year;
    String color;
    double price;

    public void setInfo(String make, String model, int year, String color, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    public void start(){
        System.out.println(make + " is starting");
    }
}
