package week10.day29_inheritance.carTask;

public class BMW extends Car{

    public BMW() {
    }

    public BMW(String make, String model, String color, int year, double price) {
        super("BMW", model, color, year, price);
    }

    public void setInfo(String model, String color, int year, double price) {
        //this.setInfo("BMW", model, color, year, price);
        setMake("BMW");
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }
}
