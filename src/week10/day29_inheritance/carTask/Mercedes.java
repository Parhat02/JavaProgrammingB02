package week10.day29_inheritance.carTask;

public class Mercedes extends Car{

    public void setInfo(String model, String color, int year, double price) {
        setMake("Mercedes");
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }
}
