package week08.day23_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6, 7, 8));

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("_________________________________________");

        ArrayList<String> items = new ArrayList<>(Arrays.asList("Eggs", "Potato",  "Milk", "Tomato", "Rice", "Orange",
                "Strawberry", "Blueberry", "Paper towels"));

        Collections.sort(items);

        System.out.println(items);

        Collections.reverse(items);

        System.out.println(items);

        System.out.println("_________________________________________");

        ArrayList<String> students = new ArrayList<>(Arrays.asList("Gadir", "Hasan", "Abidullah", "Bilal"));

        System.out.println(students);

        Collections.swap(students, 0, 1);

        System.out.println(students);

        System.out.println("_________________________________________");

        Collections.swap(students, 0, students.size()-1);
        System.out.println(students);
    }
}
