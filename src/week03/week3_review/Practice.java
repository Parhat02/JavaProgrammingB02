package week03.week3_review;

import java.util.Scanner;

public class Practice {
    /*
    Our customer is the owner of a cafe, and she wants to provide discounts to her customers based on their loyalty
    points. If a customer has more than 20 loyalty points, the customer will be considered as a member,
    and a 10% discount will be provided for his/her drinks.
Write a Java program that takes the loyalty points of a customer as input
and outputs the below message if the customer is a member:

•    Member: “Congratulations! You are a member. Enjoy a 10% discount!"

2. The cafe owner wants to give another message to the members who have less than 20 loyalty points.
        Write a Java program that takes the loyalty points of a customer as input and outputs
        the below messages based on their loyalty points:

•    Member: “Congratulations! You are Member. Enjoy a 10% discount!"
•    Regular Customer: "Thank you. No discount applied this time."
3. Our cafe owner needs another validation for loyalty points. Write a Java program that takes
the loyalty points of a customer as input and outputs the below messages. The loyalty points
are positive integers and should only be multiples of 10. Otherwise, the “Invalid Loyalty Number!”
message will be displayed on the screen.

•    Member: “Congratulations! You are Member. Enjoy a 10% discount!"
•    Regular Customer: "Thank you. No discount applied this time."
•    Invalid: “Invalid Loyalty Number!”
4.The cafe owner came up with new requirements. New discount levels are defined as follows:

•    Gold Member: 10% discount for 100 or more loyalty points
•    Silver Member: 5% discount for 50 to 99 loyalty points
•    Bronze Member: 2% discount for 20 to 49 loyalty points
•    Regular Customer: No discount for less than 20 loyalty points

Write a Java program that takes the loyalty points of a customer as input and outputs the below
messages based on their loyalty points. The loyalty points are positive integers and should only be
multiples of 10. Otherwise, the below message will be displayed on the screen.

•    Gold Member: "Congratulations! You are a Gold Member. Enjoy a 10% discount!"
•    Silver Member: "You are a Silver Member. Enjoy a 5% discount on your order."
•    Bronze Member: "As a Bronze Member, you qualify for a 2% discount."
•    Regular Customer: "Thank you. No discount applied this time."
•    “Invalid Loyalty Number!”
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your loyalty point: ");
        int loyalty = input.nextInt();
        String result ;

        if (loyalty >= 0){
            if (loyalty >= 100){
                result = "Congratulations! You are a Gold Member. Enjoy a 10% discount!";
            } else if (loyalty >= 50) {
                result = "You are a Silver Member. Enjoy a 5% discount on your order.";
            } else if (loyalty >= 20) {
                result = "As a Bronze Member, you qualify for a 2% discount.";
            }else {
                result = "Thank you. No discount applied this time";
            }
        }else {
            result = "Invalid Loyalty Number!";
        }
        System.out.println(result);
        input.close();
    }
}
