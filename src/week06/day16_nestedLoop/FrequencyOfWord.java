package week06.day16_nestedLoop;

import java.util.Scanner;

public class FrequencyOfWord {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = input.nextLine().toLowerCase();
        System.out.println("Enter a word: ");
        String word = input.next().toLowerCase();

        int count = 0;

        while (sentence.contains(word)){
            count ++;
            sentence = sentence.replaceFirst(word, "");
        }

        System.out.println(count);
    }

    /*
    3.  Write a program that can return the frequency of the word java from a sentence
		    Ex:
		        sentence = "java JAVA jAvA JAva"

		    output:
		        4


        "Java Java Java Java"; //count = 0;
        " Java Java Java" // count = 1
        " Java Java" // count = 2;
        " Java"    // count = 3
        " "       // count = 4
 */

}
