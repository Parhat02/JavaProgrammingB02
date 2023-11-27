package week04.week04_review;

import java.util.Scanner;

public class RoomReservationApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Cydeo Skyline Inn!");
        System.out.println("Would you like to reserve a room? (Yes/No)");
        String answer = input.next().toLowerCase();
        if (answer.equals("no")){
            System.out.println("You have a wonderful day!");
            System.exit(0);
        }else if(answer.equals("yes")) {
            System.out.println("Enter your first name: ");
            String firstName = input.next();
            firstName = firstName.toUpperCase().charAt(0) + firstName.substring(1).toLowerCase();
            System.out.println("Enter your last name: ");
            String lastName = input.next().toLowerCase();
            lastName = lastName.toUpperCase().charAt(0) + lastName.substring(1);
            System.out.println("Enter your age: ");
            int age = input.nextInt();

            double discount = 0;
            if (age <= 0){
                System.err.println("Invalid age, please try again later!");
                System.exit(1);
            }
            if (age >= 64) {
                discount += 0.1;
            }
            System.out.println("Here are our available rooms and their prices:\n" +
                    "\t\t\t\t\t\t\t\t\t King Bed   ===== $160\n" +
                    "\t\t\t\t\t\t\t\t\t Queen Bed  ===== $120\n" +
                    "\t\t\t\t\t\t\t\t\t Single Bed ===== $100\n" +
                    "Which room would you like to reserve? (King/Queen/Single)");
            String roomType = input.next().toLowerCase();
            if ( !(roomType.equals("king") || roomType.equals("queen") || roomType.equals("single") ) ){
                System.err.println("Invalid room type, please try again later!");
                System.exit(1);
            }
            double price = (roomType.equals("king"))? 160: (roomType.equals("queen"))? 120 : 100;
            System.out.println("How many nights do you want to stay?");
            int numberOfNights = input.nextInt();
            if (numberOfNights <=0){
                System.err.println("Invalid number, please try again later!");
                System.exit(1);
            }
            System.out.println("Are you a veteran? (Yes/No)");
            answer = input.next().toLowerCase();
            if ( !(answer.equals("yes") || answer.equals("no"))){
                System.err.println("Invalid answer, please try again later!");
                System.exit(1);
            }
            if (answer.equals("yes")) {
                discount += 0.15;
            }
            double totalPrice = price * numberOfNights;
            double totalTax = totalPrice*0.08;
            double totalDiscount = totalPrice * discount;

            double grandTotalPrice = totalPrice + totalTax - totalDiscount;

            System.out.println("Hello "+firstName+" "+lastName+" You have selected "+roomType+" Bed for "
                    +numberOfNights + " nights to stay.");
            System.out.println("Room fee: "+totalPrice);
            System.out.println("Tax is: "+totalTax);
            System.out.println("Your total discount is: "+totalDiscount);
            System.out.println("Your grand total is: "+ grandTotalPrice);

        }else{
            System.err.println("Invalid answer, please try again later!");
            System.exit(1);
        }
    }
}
