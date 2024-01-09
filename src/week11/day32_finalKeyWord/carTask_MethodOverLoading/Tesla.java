package week11.day32_finalKeyWord.carTask_MethodOverLoading;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public final  void autoPilot(){
        System.out.println(getMake()+" "+getModel()+" is in self-driving mode");
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start " +getMake()+" "+getModel());
    }

    @Override
    public void setModel(String model) {
        ArrayList<String> models = new ArrayList<>();
        models.addAll(Arrays.asList("Model S", "Model Y", "Model X", "Model 3"));

        if(!models.contains(model)){ // if specified model is not valid model
            System.err.println("Invalid Tesla Model: "+model);
            System.exit(1);
        }

        super.setModel(model); // this.model = model;
    }


    @Override
    public void setColor(String color) {
        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("White", "Red", "Black", "Silver", "Blue", "Brown", "Green"));

        if(!colors.contains(color)){
            System.err.println("Invalid Tesla Color: "+color);
            System.exit(1);
        }

        super.setColor(color); // this.color = color;
    }


    @Override
    public void setYear(int year) {

        if(year < 2008){
            System.err.println("Invalid year of Tesla car: "+year);
            System.exit(1);
        }

        super.setYear(year);
    }


    @Override
    public void setPrice(double price) {

        if(price < 50000){
            System.err.println("Invalid price for tesla car: "+price);
            System.exit(1);
        }

        super.setPrice(price);
    }

}
