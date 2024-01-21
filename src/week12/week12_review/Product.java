package week12.week12_review;

public class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            throw new InvalidProductNameException();
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {

        if(price <= 0){
            throw new InvalidProductPriceException();
        }

        this.price = price;
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
