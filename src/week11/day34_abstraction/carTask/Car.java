package week11.day34_abstraction.carTask;

public abstract class Car { // meat to be inherited, can not be instantiated

    private final String make, model;
    private final int year;
    private double price;
    private String color;

    public Car(String model, String color, int year, double price) {

        this.make = getClass().getSimpleName();

        if (model == null || color == null || model.isEmpty() || color.isEmpty()){
            System.err.println("Year can not be less than 1886");
            System.exit(1);
        }
        this.model = model;

        if (year < 1886){
            System.err.println("Year can not be less than 1886");
            System.exit(1);
        }
        this.year = year;

        setPrice(price);
        setColor(color);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
//            System.err.println("Price can not be negative or zero");
//            System.exit(1);
            throw new RuntimeException("Price can not be negative or zero");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void start();

    public abstract void drive();

    protected final void stop(){ // to make sure that non-sub classes outside the package can not access it
        System.out.println("Press the brake to stop " + make +" "+model);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+" {" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

