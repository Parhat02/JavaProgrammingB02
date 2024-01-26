package week13.day42_maps.day42Tasks;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task1Student {

    public static void main(String[] args) {

        /*
        1. Create a map that can contain the student name (String) and student scores (int[]) as a pair (Assume that each student has 5 scores and make the student name unique)
		1.1 add at least 5 pairs into the map
		1.2 Write a program that can display each student name and scores
         */

        Map<String, int[]> mapOfStudent = new LinkedHashMap<>();

        mapOfStudent.put("John", new int[]{95, 85, 75, 72, 81});
        mapOfStudent.put("Antony", new int[]{98, 88, 78, 73, 82});
        mapOfStudent.put("Jimmy", new int[]{96, 86, 76, 74, 83});
        mapOfStudent.put("Jalil", new int[]{94, 84, 74, 75, 84});
        mapOfStudent.put("Conor", new int[]{97, 87, 77, 76, 85});

        for (Map.Entry<String, int[]> stringEntry : mapOfStudent.entrySet()) {
            //System.out.println(stringEntry);
            System.out.println(stringEntry.getKey() + " : " + Arrays.toString(stringEntry.getValue()));
        }

        System.out.println("------------------------------------------------------------");


        for (String each : mapOfStudent.keySet()){
            System.out.println(each + " : " + Arrays.toString(mapOfStudent.get(each)));
        }

        System.out.println("------------------------------------------------------------");

        for (int[] each : mapOfStudent.values()){
            System.out.println(Arrays.toString(each));
        }

        System.out.println("------------------------------------------------------------");

        mapOfStudent.forEach((k, v) -> {
            System.out.println(k + " : " + Arrays.toString(v));
        });


    }
}
