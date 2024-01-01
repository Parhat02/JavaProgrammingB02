package week10.day29_inheritance.carTask;

public class Honda extends Car{

    public void setInfo(String model, String color, int year, double price) {
        setMake("Honda");
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }
}
