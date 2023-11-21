package week03.day09_scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number:");

        byte num1 = input.nextByte(); // -128 ~ 127

        System.out.println("Enter your second number:");

        short num2 = input.nextShort();

        System.out.println("Enter your third number:");

        int num3 = input.nextInt();

        System.out.println("Enter your fourth number:");

        long num4 = input.nextLong();

        //input.close(); // scanner is closed, can not read user inputs again

        /*
        System.out.println("Enter your fifth number:");
        int num5 = input.nextInt();

        Scanner is closed at line 27, once it's closed can not read inputs
*/
        System.out.println("First number: "+num1);
        System.out.println("Second number: " + num2);
        System.out.println("Third number: "+num3);
        System.out.println("Fourth number: "+num4);
        //   System.out.println("Fifth number: "+num5);


        // input.close(); // scanner is closed, can not read user inputs again

        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter your first decimal number:");
        float n1 = input2.nextFloat();

        System.out.println("Enter your second decimal number:");
        double n2 = input2.nextDouble();

        System.out.println("Enter true or false:");
        boolean r = input2.nextBoolean();

        System.out.println("num1 = " + n1);
        System.out.println("num2 = " + n2);
        System.out.println("r = " + r);

        //input.close();

        Scanner input3 = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = input3.next().charAt(0);

        //    System.out.println("You have entered: "+ch);


        System.out.println("Would you like to continue?");
        String answer = input3.next();  // I do not know ==> I
        // String answer = input.nextLine(); // I do not know ==> I do not know

        System.out.println("You have entered: " + answer);

        input.close();
    }
}
