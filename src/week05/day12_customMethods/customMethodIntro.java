package week05.day12_customMethods;

public class customMethodIntro {

    public static void greeting(){
        System.out.println("Hello Cydeo");
        System.out.println("How are you today?");
        System.out.println("Are you ready to learn Java");
    }

    public static void displayMessage(){
        System.out.println("Hello World");
        System.out.println("I Love Java");
    }
    public static void oddOrEven(int number){
        if (number %2 == 0){
            System.out.println(number+ " is Even number");
        }else{
            System.out.println(number + " is Odd number");
        }
    }

    public static void main(String[] args) {
        System.out.println("Test Started");

        greeting();
        displayMessage();
        oddOrEven(100);

        System.out.println("Test Completed");
    }
}
