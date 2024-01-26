package week13.day42_maps.day42Tasks;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task4Students {

    public static void main(String[] args) {

        String[] group1 = {"Gadir", "Hasan", "Abidullah", "Bilal"};
        String[] group2 = {"Yaxier", "Madiyar", "Ali", "Abidullah", "Alena"};
        String[] group3 = {"Yasin", "Sumeye", "Ermek", "Umran"};
        String[] group4 = {"John", "Antony", "Jimmy", "James" };
        String[] group5 = {"Josh", "Cory", "Anderson","Steven"};

        Map<Integer, String[]> groups = new LinkedHashMap<>();

        groups.put(1, group1);
        groups.put(2, group2);
        groups.put(3, group3);
        groups.put(4, group4);

        System.out.println("group1 : " + Arrays.toString(groups.get(1)));

        groups.forEach((k,v) -> {
            System.out.println(k + " : " + Arrays.toString(v));
        });

        for (Map.Entry<Integer, String[]> entry : groups.entrySet()) {

            System.out.println(entry.getKey() + " : " + Arrays.toString(entry.getValue()));

            for (String str : entry.getValue()){
                System.out.println(str);
            }

        }


    }
}

/*
	    4.1 Create a map that contains group id and names of group members

	            Map<Integer, String[]> groups = new LinkedHashMap();

	        add all the group 1d and group members into the map named groups

	    4.2 Display the names of each student with group id of 1

	    4.3 Display the names of each student from each groups
 */