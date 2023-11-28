package week05.day13_customMethods;

public class ReturnMethodIntro {
    public static void main(String[] args) {

        eligibleToBuyAlcohol(151);
        System.out.println("---------------------------------------");

        boolean exit = true;
        if (exit){
            return; // main method gets terminated
            //System.out.println("Hello"); / this line will not be executed because the main method is terminated
            // in previous line by return method.
        }
    }

    public static void eligibleToBuyAlcohol(int age){
        if (age < 0 || age > 150){
            System.err.println("Invalid age: "+age);
            //System.exit(1);
            return;
        }
        if (age >= 21){
            System.out.println("Eligible to buy alcohol");
        }else {
            System.out.println("Not eligible");
        }
    }

    public static int multiplication(int n1, int n2){
        return n1*n2;
    }



}
