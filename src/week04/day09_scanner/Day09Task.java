package week04.day09_scanner;

import java.util.Scanner;

public class Day09Task {
    public static void main(String[] args) {
        /*
        1. Ask the user how many people they live with:
            if the user lives with fewer than 3 people: print "Live with less than 3 people"
            if the user lives with 3 - 6 people: print "Live with 3 - 6 people"
            if the user lives with more than 6 people: print "Live with "more than 6 people"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("How many people do you live with? :");
        int numberOfPeople = input.nextInt();
        String result;
        if (numberOfPeople >0){
            if (numberOfPeople < 3){
                result = "Live with less than 3 people";
            } else if (numberOfPeople <= 6) {
                result = "Live with 3 - 6 people";
            } else {
                result = "Live with more than 6 people";
            }
        }else {
            result = "Invalid number";
        }
        System.out.println(result);

        /*
2. Create a class named Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
         */
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        double areaOfTheCircle = radius*radius*3.14;
        double perimeterOfTheCircle = 2*3.14*radius;
        System.out.println("The area of the circle: "+areaOfTheCircle);
        System.out.println("The perimeter of the circle: "+perimeterOfTheCircle);

        /*
3. Create a class named GradeReport:
            2.1 Ask the user to enter his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If the user enters an invalid score (negative or more than 100) print "Invalid Score"
         */

        System.out.println("Enter you score : ");
        int score = input.nextInt();

        if (score >= 0 && score <= 100) {
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
        } else {
            result = "Invalid Score";
        }
        System.out.println("Your grade is: " + result);

        /*
        4. Create a class named SpeedCheck and write a program for the speed check.
	A variable named speedLimit is given
	Ask the user to enter the current speed, if the current speed is over the speed limit
	then print slow down, otherwise do not print anything
         */
        int speedLimit = 55;
        System.out.println("What is your current speed : ");
        int currentSpeed = input.nextInt();
        if (currentSpeed > 0){
            if (currentSpeed > speedLimit){
                result = "You're driving 55 mph over the limit. Slow down!";
            }else {
                result = "You are driving at a normal speed";
            }
        }else {
            result = "You are not moving";
        }
        System.out.println(result);

        /*
        5. Create a class named CentsToDollars, and write a program that can convert cents to dollars
	if there is any remainder include them in the result of cents
         */
        System.out.println("Enter cents : ");
        double cents = input.nextDouble();
        double dollars = cents/100;
        double remainedCents = cents%100;
        System.out.println(cents+" cents equal to "+dollars+" dollars and "+remainedCents+" cents");

        /*
        6. Create a class named MilesToKM, and write a program that can convert Miles to KM
            Ex:
            Enter miles:
                10.0
                output:
                10.0 miles equal to 16.09 kilometers
         */
        System.out.println("Enter miles : ");
        int miles = input.nextInt();
        double kilometers = miles*1.609;
        System.out.println(miles+" miles equal to "+kilometers+" kilometers");

        /*
7. Create a class named PlaceAnOrder:
                Ask the User to enter the product name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)
         */
        input.nextLine();
        System.out.println("Enter the product name : ");
        String productName = input.nextLine();
        System.out.println(productName);
        System.out.println("Enter the price : ");
        double price = input.nextDouble();
        System.out.println("Enter the quantity : ");
        int quantity = input.nextInt();
        System.out.println("Enter your first name ; ");
        String name = input.next();
        double totalPrice = price * quantity;
        System.out.println(name + " your order for " +quantity+" "+productName+" has been placed. Your total is "+totalPrice);


    }
}
