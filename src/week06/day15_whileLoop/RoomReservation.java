package week06.day15_whileLoop;

import java.util.Scanner;

public class RoomReservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Would you like to reserve a room? (Yes/No)");
        String answer = input.next().toLowerCase();

        while ( !(answer.equals("yes") || answer.equals("no"))){
            System.err.println("Invalid Entry!  Please re-enter, Would you like to reserve a room? (Yes/No)");
            answer = input.next().toLowerCase();
        }
        if (answer.equals("yes")) {
            double grandTotalPrice = 0;
            String anotherRoom;
            do {
                System.out.println("Select a room: \n K. King Bed ==> 120$\n Q. Queen Bed ==> 100$\n S. Single Bed ==> 80$ (K/Q/S)");
                String roomType = input.next().toLowerCase();
                while (!(roomType.equals("k") || roomType.equals("q") || roomType.equals("s"))) {
                    System.err.println("Invalid Entry! re-select, \\n K. King Bed ==> 120$\\n Q. Queen Bed ==> 100$\\n " +
                            "S. Single Bed ==> 80$ (K/Q/S)\"");
                    roomType = input.next().toLowerCase();
                }
                double price = (roomType.equals("k")) ? 120 : (roomType.equals("q")) ? 100 : 80;
                System.out.println("How many nights do you want to stay?");
                int numberOfNights = input.nextInt();
                while (numberOfNights <= 0) {
                    System.err.println("Invalid number, re-enter, How many nights do you want to stay?");
                    numberOfNights = input.nextInt();
                }
                double totalPrice = price * numberOfNights;
                grandTotalPrice += totalPrice;
                System.out.println("Would you like to reserve another room? (Yes/No)");
                anotherRoom = input.next().toLowerCase();
                while (!(anotherRoom.equals("yes") || anotherRoom.equals("no"))) {
                    System.err.println("Invalid Entry!  Please re-enter, Would you like to reserve another room? (Yes/No)");
                    anotherRoom = input.next().toLowerCase();
                }
            } while (anotherRoom.equals("yes"));

            System.out.println("Your grand total is: " + grandTotalPrice);
        }else {
            System.out.println("Have a nice day");
        }
        input.close();
    }

    /*
8. Create a class called RoomReservation, and write a program for the room reservation; your program asks the user
if they want to reserve a room. if the user enters yes, then ask which type of room the user wants to reserve.
if the user entered no, print "Have a nice day"
(if the user entered any invalid answer (other than yes/no) ask the user to reenter until the user provides a valid entry)

	            King Bed ==> 120$
	            Queen Bed ==> 100$
	            single Bed ==> 80$

            the program should be able to display the room he/she reserved and the total price of the room.

            (if the user selected an invalid room, ask the user to reselect the room until the user provides a valid entry)

     */
}
