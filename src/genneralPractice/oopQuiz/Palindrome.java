package genneralPractice.oopQuiz;

import java.util.ArrayList;

public class Palindrome {
    public static void main(String[] args) {
        // Question1: Palindrome String
        System.out.println(isPalindrome("Radar"));
        System.out.println(isPalindrome("rotator"));
        System.out.println(isPalindrome("Summer"));
        System.out.println(isPalindrome("Was it a car or a cat I saw"));
        System.out.println(isPalindrome(""));
        System.out.println(isPalindrome(" "));

        // Question2 : Find palindrome Strings in given array
        String[] arr = {"abc", "car", "ada", "race car", "cool"};
        String[] arr2 = {"def", "ab"};
        System.out.println(findPalindrome(arr));
        System.out.println(findPalindrome(arr2));

    }

    // Question1: Palindrome String
    public static boolean isPalindrome(String str){
        str = str.toLowerCase();
        String newStr = "";
        for (char each:str.toCharArray()){
            if (Character.isLetterOrDigit(each)){
                newStr += each;
            }
        }
        String reverse = "";
        for (int i = newStr.length()-1; i >= 0; i--) {
            reverse += newStr.charAt(i);
        }
        return newStr.equals(reverse);
    }

    // Question2 : Find palindrome Strings in given array
    public static ArrayList<String> findPalindrome(String[] strArray){
        ArrayList<String> listOfPalindrome = new ArrayList<>();
        for (String s : strArray) {
            if (isPalindrome(s)){
                listOfPalindrome.add(s);
            }
        }
        return listOfPalindrome;
    }

}
