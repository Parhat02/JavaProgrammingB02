package week06.day16_nestedLoop;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String answer = "yes";

        while (answer.equals("yes")) {

            System.out.println("Enter you score : ");
            int score = input.nextInt();
            String result = "";

            if (score > 100 || score < 0) {
                System.err.println("Invalid Entry");
                System.exit(1);
            }

            if (score >= 95) {
                result = "A";
            } else if (score >= 80) {
                result = "B";
            } else if (score >= 70) {
                result = "C";
            } else if (score >= 60) {
                result = "D";
            } else {
                result = "F";
            }

            System.out.println("Your grade is: " + result);

            System.out.println("Would you like to continue? (Yes/No)");
            answer = input.next().toLowerCase();
            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Entry!  Please re-enter, Would you like to continue? (Yes/No)");
                answer = input.next().toLowerCase();
            }

        }
        System.out.println("Thank you for using Cydeo Grade Calculator APP");

    }

    /*
    7. Write a program for the grade calculator:
                        1. Ask the user to "Enter your score"
                                If user enters an invalid score, terminate the program after displaying the error message "Invalid Entry"

                         2. Display the grade of the student.
                                        90 ~ 100 ==> A
                                        80 ~ 89 ==> B
                                        70 ~ 79 ==> C
                                        60 ~ 69 ==> D
                                        0 ~ 59 ==> F

                        2. Ask the user would you like to continue
                                If "yes" --> repeat the previous steps
                                If "no" --> print "Thank you for using Cydeo Grade Calculator APP"

                                If the user enters an invalid entry, terminate the program after displaying the error message "Invalid Entry"


                         Hint: you can use  System.exit(1) to terminate the entire program
     */
}
