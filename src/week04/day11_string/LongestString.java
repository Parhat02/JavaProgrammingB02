package week04.day11_string;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String first = input.nextLine();

        System.out.println("Enter the second string:");
        String second = input.nextLine();

        input.close();;

        if( first.length() > second.length()){
            System.out.println("first string is the longest");
        }else if(first.length() < second.length()){
            System.out.println("second string is the longest");
        }else{
            System.out.println("Equal");
        }
    }
}
