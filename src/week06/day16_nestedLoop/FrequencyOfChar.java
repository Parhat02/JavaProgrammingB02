package week06.day16_nestedLoop;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String str = input.next().toLowerCase();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    count ++;
                }
            }
            if (result.contains(str.charAt(i)+"")){
                continue;
            }
            result =result + str.charAt(i)+count;
        }
        System.out.println(result);
    }

    /*
    9. Write a program that can find the frequency of the characters from a string

                         Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


            Hint: if you find out how to find the frequency of one character, then repeat it for all the remaining characters

     */
}
