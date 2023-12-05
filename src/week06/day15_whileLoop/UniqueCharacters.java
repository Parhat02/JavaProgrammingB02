package week06.day15_whileLoop;

import java.util.Scanner;

public class UniqueCharacters {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.next();
        String unique = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int firstIndex = str.indexOf(ch);
            int lastIndex = str.lastIndexOf(ch);
            if (firstIndex == lastIndex){
                unique += ch;
            }
        }
        System.out.println(unique);

    }

    /*
    9. Create a class called UniqueCharacters, Write a program that can return the unique characters from a String

	            Ex:
	                input:
	                    AABCCD

	                output:
	                    BD

	            Hint: You will need indexOf() and lastIndexOf()
	                  if the first and last index numbers of the character are the same, then it's a unique

     */
}
