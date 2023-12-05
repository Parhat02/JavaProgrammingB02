package week06.day15_whileLoop;

import java.util.Scanner;

public class InsuranceQuote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = input.nextLine();

        System.out.println("What is your Gender? ");
        String gender = input.next().toLowerCase();
        while ( !(gender.equals("male") || gender.equals("female"))){
            System.err.println("Invalid Entry, What is your gender?");
            gender = input.next().toLowerCase();
        }

        System.out.println("Are you married? (Yes/No)");
        String married = input.next().toLowerCase();
        while ( !(married.equals("yes") || married.equals("no"))){
            System.err.println("Invalid Entry!  Please re-enter, Are you married? (Yes/No)");
            married = input.next().toLowerCase();
        }

        System.out.println("What is your age? ");
        int age = input.nextInt();
        while (age <= 0 || age >=120){
            System.err.println("Invalid Entry, What is your age?");
            age = input.nextInt();
        }

        System.out.println("how many miles do you drive in a day?");
        int miles = input.nextInt();
        while (miles <= 5){
            System.err.println("Invalid Entry, how many miles do you drive in a day?");
            miles = input.nextInt();
        }

        System.out.println("Do you want full coverage or liability insurance? (Full/Liability)");
        String insurance = input.next().toLowerCase();
        while ( !(insurance.equals("full") || insurance.equals("liability"))){
            System.err.println("Invalid Entry!  Do you want full coverage or liability insurance? (Full/Liability)");
            insurance = input.next().toLowerCase();
        }

        System.out.println("Did you have any accidents or claims in the past 5 years (Yes/No)");
        String accidents = input.next().toLowerCase();
        accidents = invalidEntry(accidents);
        System.out.println("You entered : "+accidents);

        System.out.println("Do your car has an anti-theft device? (Yes/No)");
        String antiTheft = input.next().toLowerCase();
        antiTheft = invalidEntry(antiTheft);
        System.out.println("You entered : "+antiTheft);

        int startingPrice = 0, priceForAge = 0, priceForMiles = 0;
        double totalPrice = 0;
        if (insurance.equals("liability")){
            priceForAge = (age < 25)? 90 : 50;
            priceForMiles = (miles <= 10)? 10: (miles > 50)? 50 : 30;
            startingPrice = priceForAge + priceForMiles;
        }else{
            priceForAge = (age < 25)? 160 : 120;
            priceForMiles = (miles <= 10)? 20: (miles > 50)? 70 : 40;
            startingPrice = priceForAge + priceForMiles;
        }
        totalPrice = startingPrice;
        if (antiTheft.equals("yes")){
            totalPrice = totalPrice - startingPrice*0.05;
        }
        if (accidents.equals("yes")){
            totalPrice = totalPrice + startingPrice*0.15;
        }else {
            totalPrice = totalPrice - startingPrice*0.1;
        }
        if (married.equals("yes")){
            totalPrice = totalPrice - startingPrice*0.05;
        }
        System.out.println("Total price for the Insurance is : " + totalPrice);
    }

    public static String invalidEntry(String answer){
        Scanner input = new Scanner(System.in);
        String answer1 = "";
        while ( !(answer.equals("yes") || answer.equals("no"))){
            System.err.println("Invalid Entry!  Please re-enter, Enter yes or no? (Yes/No)");
            answer = input.next().toLowerCase();
        }
        answer1 = answer;

        return answer1;
    }


    /*
    10. Create a class called InsuranceQuote, and write a program that can calculate the insurance cost of a person based on the following info:
	    		1. Ask the user to enter your name
	    		2. Ask the user to enter your gender
	    			(if the user enters an invalid entry, ask the user to re-enter until the user provides a valid entry)
				3. Ask the user if he/she is married(Yes/No)
						(if the user enters an invalid entry, ask the user to re-enter until the user provides a valid entry)
				4. Ask the user to enter your age
						(age can not be negative or greater than 120)
						(if the user enters an invalid entry, ask the user to re-enter until the user provides a valid entry)
				5. Ask the user to enter how many miles he/she drives in a day
						(mileage can not be negative or less than 5)
						(if the user enters an invalid entry, ask the user to re-enter until the user provides a valid entry)
				6. Ask the user if he/she wants full coverage or liability insurance.

				7. Ask if he/she had any accidents or claims in the past 5 years (Yes/No)
						(if the user enters an invalid entry, ask the user to re-enter until the user provides a valid entry)

				8. Ask the user if his/her car has an anti-theft device (Yes/No)
						(if the user enters an invalid entry, ask the user to re-enter until the user provides a valid entry)

			Calculate the price of the insurance and display all the info of the user

				Insurance Quote calculation:
					starting prices for liability:
						age < 25 ===> 90
						age >= 25 ==> 50

						miles <= 10 ====> $10
					    miles > 10 and miles <= 50 ==> $30
					    miles > 50 ===>  $50

					starting prices for full coverage:
						age < 25 ===> 160
						age >= 25 ==> 120

						miles <= 10 ====> $20
					    miles > 10 and miles <= 50 ==> $40
					    miles > 50 ===>  $70


				    If the car has an anti-theft device ==> 5% discount
				    If he/she had any accidents or claims in the past 5 years ===> 15% extra charge
				    If he/she never had any accidents or claims in the past 5 years ==> 10% discount
				    If he/she is married ==> 5% discount

     */
}
