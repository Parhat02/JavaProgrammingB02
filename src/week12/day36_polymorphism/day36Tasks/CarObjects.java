package week12.day36_polymorphism.day36Tasks;

import week11.day34_abstraction.carTask.Audi;
import week11.day34_abstraction.carTask.Car;
import week11.day34_abstraction.carTask.Honda;
import week11.day34_abstraction.carTask.Tesla;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car[] cars = {new Honda("Pilot","White", 2010, 25000),
                new Audi("Q6", "Red",2014, 32000),
                new Honda("Accord", "White",2011, 20000  ),
                new Audi("Q4", "Blue", 2015, 33000),
                new Audi("A7", "Black",2019, 35000),
                new Audi("Q8", "White",2018, 40000),
                new Audi("Q5", "Purple",2009, 30000),
                new Audi("A4", "Black", 2011, 30000),
                new Honda("Civic", "Red",2018, 30000),
                new Honda("CR-V", "Red", 2012, 23000),
                new Honda("HR-V", "Blue",2019, 35000),
                new Tesla("Model 3", "White", 2015, 45000),
                new Tesla("Model Y", "Black", 2017, 65000),
                new Tesla("Model X", "White", 2016, 48000),
                new Tesla("Model X", "Blue",2014, 48000),};

        System.out.println(cars[0].getClass().getSimpleName());

        //  1.2 Write a program that can display all the cars that are eligible for recall

        ArrayList<Car> eligibleForRecall = new ArrayList<>();
        for (Car car : cars){
            if ((car.getClass().getSimpleName().equals("Honda") && car.getYear() >= 2010 && car.getYear()<=2011) ||
                    (car.getClass().getSimpleName().equals("Audi") && car.getYear() >= 2015 && car.getYear()<=2019) ||
                    (car.getClass().getSimpleName().equals("Tesla") && car.getYear() >= 2015 && car.getYear()<=2016)){

                eligibleForRecall.add(car);
            }
        }
        for (Car car : eligibleForRecall){
            System.out.println(car);
        }
        //System.out.println(eligibleForRecall.toString());

        System.out.println("-----------------------------------------------------------------------------------------");

        //1.3 Write a program that can display the car that has the highest price

        Car carWithHighestPrice=cars[0];

        for (int i = 1; i < cars.length; i++) {
            if (carWithHighestPrice.getPrice() < cars[i].getPrice()){
                carWithHighestPrice = cars[i];
            }
        }
        System.out.println(carWithHighestPrice);

        System.out.println("-----------------------------------------------------------------------------------------");

        //1.3 Write a program that can display the car that has the lowest price

        Car carWithLowestPrice=cars[0];

        for (int i = 1; i < cars.length; i++) {
            if (carWithLowestPrice.getPrice() > cars[i].getPrice()){
                carWithLowestPrice = cars[i];
            }
        }
        System.out.println(carWithLowestPrice);

        System.out.println("-----------------------------------------------------------------------------------------");

        //1.4 Create an arraylist of Tesla named teslaCars and store all the tesla cars from cars array to the arrayList:
        //						ArrayList<Tesla> teslaCars = new ArrayList<>()

        ArrayList<Car> cars1 = new ArrayList<>(Arrays.asList(cars));
        cars1.removeIf(p-> !(p.getClass().getSimpleName().equals("Tesla")));
        System.out.println(cars1);


        ArrayList<Tesla> teslaCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getClass().getSimpleName().equals("Tesla")){
                teslaCars.add((Tesla) car); // down casting
            }
        }
        System.out.println(teslaCars);

    }
}
