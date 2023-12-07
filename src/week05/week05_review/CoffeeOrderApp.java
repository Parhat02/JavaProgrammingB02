package week05.week05_review;

import java.util.Scanner;

public class CoffeeOrderApp {

    public static void main(String[] args) {

        double blackCoffeePrice = 2.5,
                lattePrice = 2.8,
                cappuccinoPrice = 3.5,
                totalPrice = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("\t\tWelcome to the Coffee Order App!\n\nWould you like to order coffee? Yes/No");
        String answer = input.next().toLowerCase();

        CoffeeOrderUtility.checkInvalidInput(answer);

        if (answer.equals("no")) {
            System.out.println("Thanks for using our service!");
            return; // exits the main method
        }

        for (int i = 0; i < 1; ) { // Possibly be an infinite loop

            CoffeeOrderUtility.displayCoffeeOptions(blackCoffeePrice, lattePrice, cappuccinoPrice);

            System.out.println("Enter your choice:");
            int choice = input.nextInt();

            CoffeeOrderUtility.checkInvalidInput(choice);

            switch (choice) { // ordering the coffee & setting the total price
                case 1: // if user selected Black Coffee
                    totalPrice += CoffeeOrderUtility.orderCoffee("Black Coffee", blackCoffeePrice);
                    break;
                case 2: // if user selected Latte
                    totalPrice += CoffeeOrderUtility.orderCoffee("Latte", lattePrice);
                    break;
                case 3: // if user selected Cappuccino
                    totalPrice += CoffeeOrderUtility.orderCoffee("Cappuccino", cappuccinoPrice);
                    break;
            }

            System.out.println("Would you like to add another order? Yes/No");
            answer = input.next().toLowerCase();

            CoffeeOrderUtility.checkInvalidInput(answer);

            if (answer.equals("no")) { // if the user does not want to add another order
                System.out.println("Your total price is $" + totalPrice);
                i = 1; // to set the loop condition to false ===> loop will be terminated
            }

        }
        input.close();
    }
}
