package week10.day29_inheritance.phoneTask;

public class Nokia extends Phone{

    public Nokia() {
    }

    public Nokia(String brand, String model, String size, String color, double price) {
        super(brand, model, size, color, price);
    }

    public void selfDefence(){
        System.out.println(getBrand() + " has a very strong self-defence.");
    }

}
