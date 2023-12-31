package week08.week8_review;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"));

        //Predicate<String> sameFirstAndLastChar = p -> p.toLowerCase().charAt(0) == p.toLowerCase().charAt(p.length()-1);

        // list.removeIf(sameFirstAndLastChar);
        list.removeIf(p -> p.toLowerCase().charAt(0) == p.toLowerCase().charAt(p.length()-1));

        System.out.println(list);

    }

}

