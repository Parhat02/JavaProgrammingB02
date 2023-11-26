package week03.day11_string;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Split or No split: (Yes or No)");
        String split = input.next();
        System.out.println("Enter the number of people: ");
        int numberOfPeople = input.nextInt();
        System.out.println("Enter the check amount: ");
        int checkAmount = input.nextInt();
        System.out.println("Service Quality: (Excellent/Great/Good/Fair/Poor)");
        String qualityOfService = input.next();
        qualityOfService = qualityOfService.toLowerCase();
        if(qualityOfService.contains("excellent") || qualityOfService.contains("great") || qualityOfService.contains("good")
                || qualityOfService.contains("fair") || qualityOfService.contains("poor")){
            int tip=0;
            if (qualityOfService.equalsIgnoreCase("Excellent")){
                tip = 25;
            } else if (qualityOfService.equalsIgnoreCase("Great")) {
                tip = 20;
            }else if (qualityOfService.equalsIgnoreCase("Good")) {
                tip = 15;
            }else if (qualityOfService.equalsIgnoreCase("Fair")) {
                tip = 10;
            }else {
                tip = 5;
            }

            double totalTip = (double) (checkAmount * tip) /100;
            double totalPay = checkAmount+ totalTip;

            if (split.equalsIgnoreCase("yes")){
                double totalPerPerson = totalPay/numberOfPeople;
                double tipPerPerson = totalTip/numberOfPeople;
                System.out.println("Number of people entered: " + numberOfPeople+
                        "\nTotal to pay: " + totalPay+
                        "\nTotal tip: " + totalTip+
                        "\nTotal per person: " + totalPerPerson+
                        "\nTip per person: "+tipPerPerson);
            } else if (split.equalsIgnoreCase("no")) {
                System.out.println("Number of people entered: " + numberOfPeople+
                        "\nTotal to pay: " + totalPay+
                        "\nTotal tip: " + totalTip);
            } else {
                System.err.println("Wrong Selection, Just write yes or no");
            }

        }else{
            System.err.println("Wrong Tip Selection");
        }



        /*
        10. Create a class called TipCalculator, and write a program for a tip calculator.
    There will be different service quality benchmarks that will determine the tip given.
    There will also be the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

    The program should ask the user to enter:
            - Split or No split (Yes or No),
             - Enter the number of people (number)
             - Enter the check amount (number)
             - Service Quality (String)

    And then it should display:
             The number of people who entered
             Total to pay
             Total tip
             Total per person
             Tip per person:

        Ex:
            Split or No Split (Yes or No)?
            YeS
            Enter the number of people
            4
            Enter the check amount:
            476
            How was the service quality? (Excellent/Great/Good/Fair/Poor)
            ExCElLeNt

            output:
                Number of people entered: 4
                Total to pay: 595.0
                Total tip: 119.0
                Total per person: 148.75
                Tip per person: 29.75
         */
    }
}
