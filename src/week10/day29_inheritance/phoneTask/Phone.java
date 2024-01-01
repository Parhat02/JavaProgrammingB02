package week10.day29_inheritance.phoneTask;

public class Phone {

    private String brand, model, size,color;
    private double price;

    public Phone() {
    }

    public Phone(String brand, String model, String size, String color, double price) {
            setBrand(brand);
            setModel(model);
            setSize(size);
            setColor(color);
            setPrice(price);
    }

    public String getBrand() {
        if (brand == null){
            brand = "Unknown";
            System.err.println("Phone brand can not be empty, blank, or null");
            System.exit(1);
        }
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.isEmpty() || brand.isBlank()){
            System.err.println("Phone brand can not be empty, blank, or null");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        if (model == null){
            model = "Unknown";
            System.err.println("Phone model can not be empty, blank, or null");
            System.exit(1);
        }
        return model;
    }

    public void setModel(String model) {
        if (model.isEmpty() || model.isBlank()){
            System.err.println("Phone model can not be empty, blank, or null");
            System.exit(1);
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        if (model == null){
            model = "Unknown";
            System.err.println("Phone color can not be empty, blank, or null");
            System.exit(1);
        }
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty() || color.isBlank()){
            System.err.println("Phone color can not be empty, blank, or null");
            System.exit(1);
        }
        this.color = color;
    }

    public double getPrice() {
        if (price == 0){
            System.err.println("Phone price can not be zero or negative");
            System.exit(1);
        }
        return price;
    }

    public void setPrice(double price) {
        if (price <= 0){
            System.err.println("Phone price can not be zero or negative");
            System.exit(1);
        }
        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println("Calling : " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println("Testing : " + phoneNumber);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
