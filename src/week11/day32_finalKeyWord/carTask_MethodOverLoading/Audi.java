package week11.day32_finalKeyWord.carTask_MethodOverLoading;

public class Audi extends Car{

    public Audi(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    @Override
    public void start(){
        System.out.println("Press the start button to start "+getMake()+" "+getModel());
    }
}
