package week07.day20_forEach;

import java.util.Arrays;

public class Day20Tasks {

    public static void main(String[] args) {

        /*
        1. Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
         */

        String sentence = "I Love Java";

        String[] arrayS = sentence.split(" ");

        String word = arrayS[1];
        String reverse = "";
        for (int i = word.length()-1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }
        arrayS[1] = reverse;
        System.out.println(Arrays.toString(arrayS));

        reverse = "";
        for (int i = 0; i < arrayS.length; i++) {

            reverse = reverse + arrayS[i] +" ";
        }
        System.out.println(reverse);

        System.out.println("----------------------------------------------");


        /*
        2.  Write a program that can count the even and odd numbers from an array of integers

			Note: MUST use for each loop
         */

        int[] oddOrEven = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};

        int even = 0;
        int odd = 0;
        for (int i : oddOrEven) {

            if (i%2 == 0){
                even++;
            }
            if (i%2 != 0){
                odd++;
            }
        }
        System.out.println("odd = " + odd);
        System.out.println("even = " + even);

        System.out.println("----------------------------------------------");

        /*
3. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
          MUST use for each loop
         */

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};

        for (int i : arr1) {

            for (int j : arr2) {

                if (i==j){
                    System.out.print(i+" ");
                }
            }
        }
        System.out.println();
        System.out.println("----------------------------------------------");

        /*
4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};

            output:
                2
         */

        String[] array = {"anna", "level", "Java"};

        int countOfPalindrome = 0;
        for (String s : array) {
            String reverseS = "";
            for (int i=s.length()-1; i>=0; i--){
                reverseS = reverseS + s.charAt(i);
            }
            System.out.println(reverseS);
            if (s.equals(reverseS)){
                countOfPalindrome ++;
            }
        }
        System.out.println(countOfPalindrome);

        System.out.println("----------------------------------------------");
        /*
5. Write a program that can display the unique elements of an array
			MUST use for each loop
         */

        String[] s1 = {"A", "B", "C", "G", "A", "C", "B", "F", "V"};

        for (String s : s1){

            int count = 0;
            for (String j : s1){
                if (s.equals(j)){
                    count ++;
                }
            }

            if (count ==1){
                System.out.print(s+ " ");
            }
        }
    }
}
