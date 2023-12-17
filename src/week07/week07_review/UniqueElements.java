package week07.week07_review;

import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Java", "Python", "Python", "Ruby", "Ruby", "C#"};

        for (int i = 0; i < words.length; i++) {

            String element = words[i];
            int frequency = 0;
            for (int j = 0; j < words.length; j++) {
                if (element.equals(words[j])){
                    frequency++;
                }
            }
            if (frequency==1){
                System.out.println(element);
            }
        }


        System.out.println("---------------------------------------------");

        for (String word : words) {
            if (Collections.frequency(Arrays.asList(words), word) == 1){
                System.out.println(word);
            }
        }


        for (String word : words) {

            int frequency = 0;

            for (String s : words) {
                if (word.equals(s)){
                    frequency++;
                }
            }

            if (frequency==1){
                System.out.println(word);
            }
        }


    }
}
