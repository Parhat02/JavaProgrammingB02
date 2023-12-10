package week06.week6_review;

import java.util.Scanner;

public class PizzaOrderApp {

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        boolean  morePizza = true;
        double totalCost = 0;

        // Step1:
        System.out.println("\t\tWelcome to Cydeo Pizza House");
        System.out.println("\nWould you like to order a pizza?Yes/No");
        String answer = input.next().toLowerCase();
        answer = yesOrNo(answer);

        do {
            if (answer.equals("no")) { // if the answer is no
                System.out.println("Thanks for using our service!");
                return;
            }

            // Step2:
            System.out.println("Enter the size of the pizza (small, medium, or large):");
            String size = input.next().toLowerCase();
            while( !(size.equals("small") || size.equals("medium") || size.equals("large")) ){
                System.err.println("Invalid entry, please enter 'small' or 'medium' or 'large':");
                size = input.next().toLowerCase();
            }

            // Step 3:
            System.out.println("Enter the number of cheese toppings:");
            int cheeseTopping = input.nextInt();
            cheeseTopping = verifyToppings(cheeseTopping, "cheese");

            System.out.println("Enter the number of peperoni toppings:");
            int peperoniTopping = input.nextInt();
            peperoniTopping = verifyToppings(peperoniTopping, "peperoni");

            // Step 4:
            System.out.println("Enter the quantity:");
            int quantity = input.nextInt();
            while(quantity <= 0){
                System.err.println("Invalid entry, please re-enter the number of quantity:");
                quantity = input.nextInt();
            }

            // Step 5:
            Pizza order = new Pizza();
            order.setInfo(size, cheeseTopping, peperoniTopping, quantity);

            totalCost += order.calcCost();

            System.out.println("Your current price is $" + totalCost);

            // Step 6:

            System.out.println("Would you like to order another pizza? Yes/No");
            answer = input.next().toLowerCase();
            answer = yesOrNo(answer);
            if (answer.equals("no")){
                morePizza = false;
            }

        }while (morePizza);

        System.out.println("Your total price is $" + totalCost);
    }




    public static String yesOrNo(String answer){
        while (!(answer.equals("yes") || answer.equals("no"))) { // while the answer is invalid
            System.err.println("Invalid entry, please enter 'yes' or 'no':");
            answer = input.next().toLowerCase();
        }
        return answer;
    }

    public static int verifyToppings(int num, String typeOfTopping){
        while ( num < 0){
            System.err.println("Invalid entry, please re-enter the number of " + typeOfTopping+ " toppings:");
            num = input.nextInt();
        }
        return num;
    }
}
