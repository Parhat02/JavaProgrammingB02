package week05.day14_forLoop;

import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args) {
        System.out.println("Maximum number is: "+maximum());
        System.out.println("====================================");
        System.out.println("Minimum number is: "+minimum());
    }

    /*
    write program that can ask the user enter a number five times, and print the maximum number
     */
    public static int maximum(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int maximum = input.nextInt();
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter a number: ");
            int num = input.nextInt();
            if (num>maximum){
                maximum = num;
            }
        }
        return maximum;
    }

        /*
    write program that can ask the user enter a number five times, and print the minimum number
     */
        public static int minimum(){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int minimum = input.nextInt();
            for (int i = 0; i < 4; i++) {
                System.out.println("Enter a number: ");
                int num = input.nextInt();
                if (num<minimum){
                    minimum = num;
                }
            }
            return minimum;
        }
}
