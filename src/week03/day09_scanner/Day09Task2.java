package week03.day09_scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Day09Task2 {
    public static void main(String[] args) {

        /*
8. Create a class named StockMarket:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed
        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)
        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC
            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"
         */
        Scanner input = new Scanner(System.in);
        System.out.println("How much share you have? : ");
        int share = input.nextInt();
        System.out.println("What is the total value of your share in the stock market? : ");
        double valueOfShare = input.nextDouble();
        System.out.println("What is the name of the company you have the most shares in? : ");
        input.nextLine();
        String companyName = input.nextLine();
        System.out.println("Your total stock market holding is $"+valueOfShare+" which is made up of "+share+" shares. "
                +companyName+" is your company holdings");
        System.out.println("--------------------------------------------------------------");
        /*
9. Create a class named Calculator:
		- Ask the user to enter the first number (double)
		- Ask the user to enter a math operator (char)
		- Ask the user to enter the second number

		- print the calculation result,
		- if the operator is not a valid math operator (+, -, *, /), then print "Invalid entry"
         */
        System.out.println("Enter the first number :");
        double num1 = input.nextDouble();
        System.out.println("Enter the operator :");
        char ch = input.next().charAt(0);
        System.out.println("Enter the second number :");
        double num2 = input.nextDouble();
        double result = 0;
        switch (ch){
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '+':
                result = num1 + num2;
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
        System.out.println(result);
        System.out.println("--------------------------------------------------------------");

        /*
10. Create a class named SalaryCalculator:
		- Ask the user to enter his/her hourly rate
		- Ask the user how many hours he/she works in a week
		- Ask the user to enter state tax (in percentage)
		- Ask the user to enter federal tax (in percentage)

         -Calculate the:
                   salary
                   State tax
                   federalTax
                   Total tax
                   Net income
         */
        System.out.println("What is your hourly rate? :");
        double hourlyRate = input.nextDouble();
        System.out.println("How many hours do you work in a week? :");
        double hoursInWeek = input.nextDouble();
        System.out.println("What is the state tax? :");
        double stateTaxRate = input.nextDouble();
        System.out.println("What is the federal tax :");
        double federalTasRate = input.nextDouble();
        double salary = hourlyRate*hoursInWeek*52;
        double stateTax = salary*stateTaxRate/100;
        double federalTax = salary*federalTasRate/100;
        double totalTax = stateTax+federalTax;
        double netIncome = salary-totalTax;
        System.out.println("salary : " +salary+
                "\nState tax " +stateTax+
                "\nfederalTax " + federalTax+
                "\nTotal tax " + totalTax+
                "\nNet income " + netIncome);

    }
}
