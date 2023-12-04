package week06.day15_whileLoop;

public class DivideTwoNumbers {

    /*
    4.  Create a class named DivideTwoNumbers and Write a program
    that can divide two positive numbers without using / (division) and * (multiplication) operators.
     */
    public static void main(String[] args) {
        divide(120,11);
        multiplication(120,10);
    }

    public static void divide(int num1, int num2){
        int division = 0;
        while (num2 <= num1){
            division +=1;
            num1 -= num2;
        }
        System.out.println("Division = "+ division+", and remainder is = "+num1);
    }

    public static void multiplication(int num1, int num2){
        int result = 0;
        for (int i = 0; i < num2; i++) {
            result += num1;
        }
        System.out.println("multiplication = "+ result);
    }
}
