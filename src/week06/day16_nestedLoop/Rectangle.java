package week06.day16_nestedLoop;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";
        while (answer.equals("yes")){

            System.out.println("Enter the length of the rectangle: ");
            double length = input.nextDouble();

            if (length <= 0){
                System.err.println("Invalid Entry for the length of the rectangle");
                System.exit(1);
            }

            System.out.println("Enter the width of the rectangle: ");
            double width = input.nextDouble();

            if (width <= 0){
                System.err.println("Invalid Entry for the width of the rectangle");
                System.exit(1);
            }

            double AreaOfRectangle = length * width;
            double PerimeterOfRectangle = 2 * (length + width);

            System.out.println("1.Area of rectangle: " +AreaOfRectangle+
                    "\n2.Perimeter of a rectangle: "+ PerimeterOfRectangle);

            System.out.println("Would you like to calculate another rectangle? (Yes/No)");
            answer = input.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Entry!  Please re-enter, Would you like to calculate another rectangle? (Yes/No)");
                answer = input.next().toLowerCase();
            }

        }
        System.out.println("Thank you for using Cydeo rectangle Calculator APP");

    }

    /*
    6. Write a program that can calculate the area and perimeter of a Rectangle:
                        1. Ask the user "Enter the length of the Rectangle:"
                                if the user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the length of the rectangle"

                        2. Ask the user "Enter the width of the Rectangle:"
                                if the user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the width of the rectangle"

                        3. Display:
                                        1. Area of rectangle
                                        2. Perimeter of rectangle

                        4. Ask the user "Would you like to calculate another Rectangle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Rectangle Calculator APP"

                                If the user enters an invalid entry, ask the user to re-enter until the user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program

     */
}
