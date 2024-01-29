package week11.week11_review.deviceTask;

public abstract class Device {

    private String brand, model, color, size;
    private double price;
    public static boolean hasBattery = true, hasPowerButton = true;

    public Device(String brand, String model, String color, String size, double price) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setSize(size);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand == null){
            System.err.println("Invalid brand");
            System.exit(1);
        }

        if(brand.isEmpty() || brand.isBlank()){
            System.err.println("Invalid brand");
            System.exit(1);
        }

        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model == null){
            System.err.println("Invalid model");
            System.exit(1);
        }

        if(model.isEmpty() || model.isBlank()){
            System.err.println("Invalid model");
            System.exit(1);
        }

        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            System.err.println("Invalid price");
            System.exit(1);
        }
        this.price = price;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

}
