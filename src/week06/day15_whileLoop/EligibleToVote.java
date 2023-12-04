package week06.day15_whileLoop;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        while (!(age >= 1 && age <= 120)){
            System.err.println("Invalid Entry, Please re-enter your age: ");
            age = input.nextInt();
        }
        System.out.println("Are you a US citizen? : Yes/No");
        String answer = input.next().toLowerCase();

        while ( !(answer.equals("yes") || answer.equals("no")) ){
            System.err.println("Invalid Entry! Please re-enter: ");
            System.out.println("Are you a US citizen? Yes/No");
            answer = input.next().toLowerCase();
        }

        if (age >= 21 && answer.equals("yes")){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }

    }
}
