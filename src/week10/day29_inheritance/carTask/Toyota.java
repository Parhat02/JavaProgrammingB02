package week10.day29_inheritance.carTask;

public class Toyota extends Car{

    public void setInfo(String model, String color, int year, double price) {
        setMake("Toyota");
        setModel(model);
        setColor(color);
        setYear(year);
        setPrice(price);
    }

}
