package week05.day14_forLoop;

import java.util.Scanner;

public class LoopPractice {

    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number: ");
            sum += inout.nextInt();
        }
        System.out.println(sum);


        // Reverse String
        String str = "Muhtar";

        String reverse = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }
}
