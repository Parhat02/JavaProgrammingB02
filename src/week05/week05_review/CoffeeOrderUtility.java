package week05.week05_review;

public class CoffeeOrderUtility {

    public static void displayErrorMessage(String message) {
        System.err.println(message);
        System.exit(1);
    }


    public static void checkInvalidInput(String answer) {
        if (!(answer.equals("yes") || answer.equals("no"))) { // if the given answer is invalid (not yes and not no)
            displayErrorMessage("Invalid answer, please try again later!");
        }
    }

    public static void checkInvalidInput(int choice) {
        if (choice > 3 || choice < 1) {
            displayErrorMessage("Invalid choice, please try again later!");
        }
    }


    public static void displayCoffeeOptions(double blackCoffeePrice, double lattePrice, double cappuccinoPrice) {
        System.out.println("Coffee Options:");
        System.out.println("\t1. Black Coffee - " + blackCoffeePrice);
        System.out.println("\t2. Latte - " + lattePrice);
        System.out.println("\t3. Cappuccino - " + cappuccinoPrice);

    }

    public static double orderCoffee(String coffeeType, double price) {
        System.out.println("Added " + coffeeType + " to Your Order");
        return price;
    }


}
