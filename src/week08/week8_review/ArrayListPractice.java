package week08.week8_review;

import week07.week07_review.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPractice {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        ArrayList list = new ArrayList<>(); // ArrayList of Object

        list.add("Java");
        list.add(100);
        list.add(2.5);
        list.add(true);
        list.add(new Item());
        list.add('A');

        System.out.println(list);

        ArrayList<String> elements = new ArrayList<>(); //ArrayList of String

        elements.add("Java");

        System.out.println(elements);

        ArrayList<String> words = new ArrayList<>();

        words.addAll(Arrays.asList("Java", "Python", "Python", "Ruby", "Ruby", "C#"));

        System.out.println(words);

        for (String each : words) {
            if (Collections.frequency(words, each) == 1) {
                System.out.println(each);
            }
        }

        System.out.println("----------------------------------");

        words.forEach(p -> {if (Collections.frequency(words,p) == 1){
            System.out.println(p);}
        });

        System.out.println(words);

        ArrayList<String> temp = new ArrayList<>(words);
        temp.removeIf(p -> Collections.frequency(temp,p) !=1);

        System.out.println(temp);
        System.out.println(words);


        // removeAll();  retainAll(); removeIf();
    }
}
