package week13.day42_maps.day42Tasks;

import java.util.*;

public class Task7Unit {

    public static void main(String[] args) {

        Map<String, Double> unit1 = new LinkedHashMap<>();
        unit1.put("Print Statements", 4.0);
        unit1.put("Escape Sequences", 2.0);
        unit1.put("Primitives", 4.0);
        unit1.put("Operators", 6.0);
        unit1.put("If Statements", 9.0);
        unit1.put("Switch Statement", 4.0);
        unit1.put("Scanner", 6.0);

        Map<String, Double> unit2 = new LinkedHashMap<>();
        unit2.put("String Manipulation", 12.0);
        unit2.put("Loops", 17.5);
        unit2.put("Branching Statements", 1.5);
        unit2.put("Arrays", 14.5);
        unit2.put("Custom Methods", 16.5);
        unit2.put("Wrapper Classes", 3.0);
        unit2.put("Scanner", 6.0);

        Map<String, Double> unit3 = new LinkedHashMap<>();
        unit3.put("Custom Methods", 16.5);
        unit3.put("Wrapper Classes", 3.0);
        unit3.put("ArrayList", 11.5);

        Map<String, Double> unit4 = new LinkedHashMap<>();
        unit4.put("Custom Class", 23.5);
        unit4.put("Access Modifiers", 2.5);

        Map<String, Double> unit5 = new LinkedHashMap<>();
        unit5.put("OOP Encapsulation", 4.5);
        unit5.put("OOP Inheritance", 13.5);
        unit5.put("Final keyword", 2.5);
        unit5.put("Exceptions", 8.5);

        Map<String, Double> unit6 = new LinkedHashMap<>();
        unit6.put("OOP Abstraction", 9.5);
        unit6.put("OOP Polymorphism", 7.5);
        unit6.put("Collection", 9.5);
        unit6.put("Map", 7.5);


        List<Map<String, Double>> listOfMap = new ArrayList<>(Arrays.asList(unit1, unit2, unit3, unit4, unit5, unit6));

        List<String> moreThan7 = new ArrayList<>();

        List<String> lessThan3 = new ArrayList<>();

        List<Double> hours = new ArrayList<>();

        for (Map<String, Double> eachMap : listOfMap) {
            System.out.println(eachMap);

            for (Map.Entry<String, Double> entry : eachMap.entrySet()) {

                System.out.println("Topic : " + entry.getKey() + " " +
                        "-" + " Hours : " + entry.getValue());

                if (entry.getValue() > 7){
                    moreThan7.add(entry.getKey());
                }

                if (entry.getValue() < 3){
                    lessThan3.add(entry.getKey());
                }

                hours.add(entry.getValue());
            }

        }

        System.out.println("Names of topics we spend more than 7 hours = " + moreThan7);
        System.out.println("Names of topics we spend less than 7=3 hours = " + lessThan3);


        System.out.println("-----------------------------------------------------------------------------");


        double maximumHours = Collections.max(hours);
        double minimumHours = Collections.min(hours);

        for (Map<String, Double> map : listOfMap) {

            for (Map.Entry<String, Double> entry : map.entrySet()) {
                if (entry.getValue() == maximumHours){
                    System.out.println("Java topic which has the maximum hours is : " + entry.getKey());
                    System.out.println(entry);
                }

                if (entry.getValue() == minimumHours){
                    System.out.println("Java topic which has the minimum hours is : " + entry.getKey());
                    System.out.println(entry);
                }
            }
        }


    }
}

/*
5.1 Create a List and store all the map objects given in above

        5.2 Display each Java topic and its hours on the console

        5.3 Display the names of the java topics that we spend more than 7 hours

        5.4 Display the names of the java topics that we spend less than 3 hours

        5.5 Which Java Topic has the maximum hours?

        5.6 Which topic has the minimum hours?

 */