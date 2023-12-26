package week06.day15_whileLoop;

import java.util.Scanner;

public class Day15Tasks {

    /*
    1.  Create a class named Marriage Proposal and Write a program for the  marriage proposal program asking the user, "Will you marry me?"
    if the answer is yes, print "Congrats."
    if the answer is no, print "Goodbye"
    if the answer is neither yes nor no, print "Invalid answer, please re-enter" and repeat it until the user enters either yes or no
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Will you marry me?");
        String answer = input.next().toLowerCase();
        while ( !(answer.equals("yes") || answer.equals("no")) ){
            System.err.println("Invalid answer, please re-enter: ");
            answer = input.next().toLowerCase();
        }
        if (answer.equals("yes")){
            System.out.println("Congrats.");
        }else {
            System.out.println("Goodbye");
        }


        /*
        2. Create a class named PositiveNegative and write a program that asks the user to enter a number for 5 times,
         and print how many positive and negative numbers the user entered
         */
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        for (int i=0; i<5; i++){
            System.out.println("Enter a number: ");
            int num = input.nextInt();
            if (num > 0){
                positiveNumbers += 1;
            }
            if (num<0){
                negativeNumbers += 1;
            }
        }
        System.out.println(positiveNumbers + " positive and "+negativeNumbers+" negative");


        /*

3. Create a class named FrequencyOfChar and Write a program that asks the user to enter a string and a char,
 which returns the frequency of the char from the given string
         */
        input.nextLine();
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        System.out.println("Enter a Char: ");
        char ch = input.next().charAt(0);

        int frequency = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch){
                frequency +=1;
            }
        }
        System.out.println(frequency);


        /*

         */
    }
}
