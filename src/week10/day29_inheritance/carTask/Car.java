package week10.day29_inheritance.carTask;

public class Car {

    private String make, model, color;
    private int year;
    private double price;

    public Car() {
    }

    public Car(String make, String model, String color, int year, double price) {
        setMake(make);
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
//        this.make = make;
//        this.model = model;
//        this.color = color;
//        this.year = year;
//        this.price = price;
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
        if (year == 0){
            System.err.println("Year can not be zero or negative");
            System.exit(1);
        }
        return year;
    }

    public void setYear(int year) {
        if (year <= 0){
            System.err.println("Year can not be zero or negative");
            System.exit(1);
        }
        this.year = year;
    }

    public double getPrice() {
        if (price == 0){
            System.err.println("Car price can not be zero or negative");
            System.exit(1);
        }
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.err.println("Car price can not be zero or negative");
            System.exit(1);
        }
        this.price = price;
    }

    public void setInfo(String make, String model, String color, int year, double price) {
        setMake(make);
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", color='" + getColor() + '\'' +
                ", year=" + getYear() +
                ", price=" + getPrice() +
                '}';
    }
}
