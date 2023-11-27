package week05.day12_customMethods;

public class CustomMethodIntroWithParameter {

    public static void eligibleToBuyAlcohol(int age){
        if (age >= 21){
            System.out.println("Eligible to buy alcohol");
        }else {
            System.out.println("Not eligible");
        }
    }
    public static void oddOrEvenOrZero(int number){
        if (number %2 == 0){
            System.out.println(number+ " is Even number");
        }
        if (number == 0) {
            System.out.println(number + " is Zero");
        }
        if (number %2 != 0){
            System.out.println(number + " is Odd number");
        }
    }

    public static void maxNumber(double num1, double num2){
        if (num1 > num2){
            System.out.println(num1 + " is the maximum number");
        } else if (num1 < num2) {
            System.out.println(num2 + " is the maximum number");
        }else {
            System.out.println("Equal");
        }
    }

    public static void initial(String firstName, String lastName){
        String initial = firstName.charAt(0) + "." +lastName.charAt(0);
        System.out.println("Initial is: "+ initial);
    }
    public static void main(String[] args) {
        oddOrEvenOrZero(-9);
        eligibleToBuyAlcohol(22);
        maxNumber(23,45);
//        String firstName = "Ferhat";
//        String lastName = "Polat";
//        initial(firstName,lastName);
        initial("Ferhat","Polat");
    }
}
