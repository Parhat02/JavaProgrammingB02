package week07.day20_forEach;

import utilities.ArrayUtility;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Cydeo School";

        char[] ch = str.replace(" ", "").toCharArray();

        System.out.println( Arrays.toString(ch) );


        System.out.println("-----------------------------------------------------------");

        String str2 = "Today is a great day to learn java";

        String[] words = str2.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("-----------------------------------------------------------");

        String sentence = "Today is a great day";

        String[] arr =  ArrayUtility.reverse( sentence.split(" ") );  //[Java, love I]

        System.out.println(Arrays.toString(arr));

        String reversedSentence = ""; //"Java love I"

        for (int i = 0; i < arr.length; i++) {
            reversedSentence += arr[i] +" ";
        }


        System.out.println(reversedSentence);

    }
}
