package week04.week04_review;

import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args) {
        String pinNumber = "0123";  // has the correct pin number
        double accountBalance = 5000; // current available balance

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your pin number:");
        String userEnteredPinNumber = input.next();

        if(!userEnteredPinNumber.equals(pinNumber)){  // if the user entered PIN number is incorrect
            System.err.println("Incorrect pin number, please try again later.");
            System.exit(1); // Terminates the entire program
        }

        System.out.println("Select one of the three followings:\n\t1. Check Balance\n\t2. Deposit Money\n\t3. Withdraw Money");
        int option = input.nextInt();

        switch (option){
            case 1: // check balance
                System.out.println("Your available balance is: $" + accountBalance);
                break;

            case 2: // deposit
                System.out.println("How much would you like to deposit?");
                double depositAmount = input.nextDouble();
                if(depositAmount <= 0){ // if the depositing amount is zero or negative
                    System.err.println("Depositing amount cannot be zero or negative, please try again later.");
                    System.exit(1);
                }else{ // if the depositing amount is greater than zero
                    accountBalance += depositAmount;
                    System.out.println("Depositing $"+depositAmount +" ...\nYour new available balance is $" +accountBalance);
                }
                break;

            case 3: // withdraw
                System.out.println("How much would you like to withdraw?");
                double withdrawAmount = input.nextDouble();
                if( withdrawAmount <= 0 ){ // if the withdrawing amount is zero or negative
                    System.err.println("Cannot withdraw zero or negative amount, please try again later.");
                    System.exit(1);
                }else if(withdrawAmount > accountBalance){ // if the withdrawing amount is greater than the available balance
                    System.err.println("Insufficient funds. Withdrawal failed.");
                    System.exit(1);
                }else { //if the withdrawing amount is greater than 0 but less than available balance
                    accountBalance -= withdrawAmount;
                    System.out.println("withdrawing $" + withdrawAmount + " ...\nYour new available balance is $" + accountBalance);
                }
                break;

            default: // invalid option
                System.err.println("Invalid choice. Exiting the ATM. Thank you for using our services!");
                System.exit(1);
        }
    }
}
