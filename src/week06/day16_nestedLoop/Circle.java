package week06.day16_nestedLoop;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";
        while (answer.equals("yes")){

            System.out.println("Enter the radius of the circle: ");
            double radius = input.nextDouble();

            if (radius <= 0){
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(1);
            }

            double DiameterOfCircle = 2 * radius;
            double AreaOfCircle = 3.14 * radius *radius;
            double PerimeterOfCircle = 2 * radius * 3.14;

            System.out.println("1. Diameter of circle: " + DiameterOfCircle+
                    "\n2. Area of circle: " +AreaOfCircle+
                    "\n3. Perimeter of a circle: "+ PerimeterOfCircle);

            System.out.println("Would you like to calculate another circle? (Yes/No)");
            answer = input.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Entry!  Please re-enter, Would you like to calculate another circle? (Yes/No)");
                answer = input.next().toLowerCase();
            }

        }
        System.out.println("Thank you for using Cydeo Circle Calculator APP");

    }

    /*
    4. Write a program that can calculate the area and perimeter of a circle:
                        1. Ask the user "Enter the radius of the circle:"
                                if the user enters 0 or negative numbers, terminate the program after displaying
                                the error message "Invalid Entry for the radius of the circle"

                        2. Display:
                                        1. Diameter of circle
                                        2. Area of circle
                                        3. Perimeter of a circle

                        3. Ask the user "Would you like to calculate another circle?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Circle Calculator APP"

                                If the user enters an invalid entry, ask the user to re-enter until the user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program

     */
}
