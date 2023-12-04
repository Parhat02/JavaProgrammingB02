package week06.day15_whileLoop;

import java.util.Scanner;

public class Login {
/*
7. you are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                    username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to
                enter the correct credentials, and if all three attempts fail, then print "Your account is locked."

 */
    public static void main(String[] args) {
        String username = "Cydeo", password = "Cydeo123";
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String enteredUsername = input.next();
        System.out.println("Enter your password: ");
        String enteredPassword = input.next();
        for (int i = 0; i <= 3; i++) {
            boolean valid = username.equals(enteredUsername) && password.equals(enteredPassword);

            if (valid) {
                System.out.println("Logged in.");
                break;
            }
            if (!valid && i<3){
                System.out.println("Re-Enter your username: ");
                enteredUsername = input.next();
                System.out.println("Re-Enter your password: ");
                enteredPassword = input.next();
            }
            if (i == 3){
                System.err.println("Your account is locked.");
            }
        }
    }
}
