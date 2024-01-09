package week11.day32_finalKeyWord.carTask_MethodOverLoading;

public class Car {

    private String make, model, color;
    private int year;
    private double price;

    public static int numberOfWheels;
    public static boolean hasBattery;

    static{
        numberOfWheels = 4;
        hasBattery = true;
    }

    public Car(String model, String color, int year, double price) {
        setMake( getClass().getSimpleName() ); // setting the class name to the make of the car
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year <= 0 ){ // if specified year is negative or zero
            System.err.println("Invalid year: "+year);
            System.exit(1); // terminates the program
        }
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){ // if specified price is negative or zero
            System.err.println("Invalid price: "+price);
            System.exit(1); // terminates the program
        }
        this.price = price;
    }

    public void start(){
        System.out.println("Press the brake and twist the key to ignition to start "+make+" "+model);
    }

    @Override
    public String toString() {
        return make+"{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", wheels=" + numberOfWheels +
                '}';
    }
}
