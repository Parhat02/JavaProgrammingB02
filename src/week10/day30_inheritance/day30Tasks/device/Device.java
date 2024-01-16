package week10.day30_inheritance.day30Tasks.device;

public class Device {

    private String brand, model, color, size;
    private double price;

    private boolean hasBattery, hasPowerButton;



    public String getBrand() {
        if (brand == null){
            System.err.println("Brand can not be null");
            System.exit(1);
        }
        return brand;
    }



    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        if (model == null){
            System.err.println("Brand can not be null");
            System.exit(1);
        }
        return model;
    }

    public void setModel(String model) {
        if (model.isBlank() || model.isEmpty()){
            System.err.println("Model can not be null");
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
        if (price <= 0){
            System.err.println("Quantity can not be set to negative or zero.");
            System.exit(1);
        }
        this.price = price;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public void turnOn(){
        System.out.println(brand + " is turning on.");
    }

    public void turnOff(){
        System.out.println(brand + " is turning off.");
    }

    public Device(String brand, String model, String color, String size, double price, boolean hasBattery, boolean hasPowerButton) {
        setBrand(brand);
        setModel(model);
        setColor(color);
        setSize(size);
        setPrice(price);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public Device(String brand, String model, String size, String color, double price) {
        setBrand(brand);
        setModel(model);
        setSize(size);
        setColor(color);
        setPrice(price);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " {" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                '}';
    }
}
