package week06.day16_nestedLoop;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";
        while (answer.equals("yes")){

            System.out.println("Enter the side of the square: ");
            double side = input.nextDouble();

            if (side <= 0){
                System.err.println("Invalid Entry for the side of the square");
                System.exit(1);
            }
            
            double AreaOfSquare = side *side;
            double PerimeterOfSquare = 2 * (side + side);

            System.out.println("1.Area of square: " +AreaOfSquare+
                    "\n2.Perimeter of a square: "+ PerimeterOfSquare);

            System.out.println("Would you like to calculate another square? (Yes/No)");
            answer = input.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Entry!  Please re-enter, Would you like to calculate another square? (Yes/No)");
                answer = input.next().toLowerCase();
            }

        }
        System.out.println("Thank you for using Cydeo square Calculator APP");

    }

    /*
    5. Write a program that can calculate the area and perimeter of a Square:
                        1. Ask the user "Enter the side of the square:"
                                if the user enters 0 or negative numbers, terminate the program after displaying the error message "Invalid Entry for the side of the square"

                        2. Display:
                                        1. Area of square
                                        2. Perimeter of square

                        3. Ask the user "Would you like to calculate another Square?"
                                        If "yes" --> repeat the previous steps
                                        If "No" --> Print "Thank you for using Cydeo Square Calculator APP"

                                If the user enters an invalid entry, ask the user to re-enter until the user provides a valid entry

                        Hint: you can use  System.exit(1) to terminate the entire program


     */
}
