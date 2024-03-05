package genneralPractice;

import java.util.Arrays;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(687));
        System.out.println(sumOfDigits(12));
        System.out.println(sumOfDigits(2));

        System.out.println("------------------Question2-------------------");

        System.out.println(sumOfDigitsUntilSingleDigit(687));
        System.out.println(sumOfDigitsUntilSingleDigit(16));
        System.out.println(sumOfDigitsUntilSingleDigit(942));
        System.out.println(sumOfDigitsUntilSingleDigit(132189));
        System.out.println(sumOfDigitsUntilSingleDigit(493193));

    }

//Given a number, write a method that finds the sum of its digits. Input: n = 687 Output: 21, Input: n = 12 Output: 3
    public static int sumOfDigits(int number){
        char[] s = String.valueOf(number).toCharArray();
        int sum = 0;
        for (char each : s){
            sum= sum + Character.getNumericValue(each);
        }
        return sum;
    }

//Question-2 Sum of Digits Until Producing Single Digit
    public static int sumOfDigitsUntilSingleDigit(int number){
        while (number>10) {
            char[] s = String.valueOf(number).toCharArray();
            number = sumOfDigits(number);
        }
        return number;
    }
}
