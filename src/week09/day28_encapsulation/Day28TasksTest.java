package week09.day28_encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

public class Day28TasksTest {

    public static void main(String[] args) {

        //Task3
        Item item = new Item();
        item.setName("ki ki");

        Item item1 = new Item("Toilet paper", 5, 1);
        System.out.println(item1);

        System.out.println("-----------------------------------------------------------");

        //Task4
        Pizza pizza = new Pizza("medium", 2,5 );
        System.out.println(pizza);

        System.out.println("-----------------------------------------------------------");

        //Task5:  CandyFactory

        ArrayList<Candy> candies = new ArrayList<>();

        Candy candy1 = new Candy("sweet01", 5, 10, false);
        Candy candy2 = new Candy("sweet02", 4, 8, true);
        Candy candy3 = new Candy("sweet03", 3, 6, false);
        Candy candy4 = new Candy("sweet04", 2, 4, true);
        Candy candy5 = new Candy("sweet05", 1, 0, false);

        candies.addAll(Arrays.asList(candy1,candy2,candy3,candy4,candy5));

        for (Candy candy:candies){
            System.out.println(candy.getBrand() + " : " + candy.getPrice());
        }

        System.out.println(candy4);
        System.out.println(candy5);

        System.out.println("-----------------------------------------------------------");

        //Task6:

        Credentials credentials = new Credentials("User0001", "passWord@123");
        System.out.println(credentials);
    }
}
