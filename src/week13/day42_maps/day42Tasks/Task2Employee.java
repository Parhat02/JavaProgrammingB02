package week13.day42_maps.day42Tasks;

import java.util.*;

public class Task2Employee {

    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("Jalil", 145000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

        int maximum = map.get("John");

        List<Integer> salaries = new ArrayList<>();

        int countOfHighSalary = 0;

        for (Map.Entry<String, Integer> each : map.entrySet()){

            if (each.getValue() > 120000 && each.getValue() < 150000){
                countOfHighSalary++;
            }
            salaries.add(each.getValue());

            if (each.getValue() > maximum){
                maximum = each.getValue();
            }
        }

        System.out.println("Max salary is : " + Collections.max(salaries));

        int minimum = Collections.min(salaries);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maximum){
                System.out.println(entry.getKey() + " has the maximum salary : " + entry.getValue());
            }

            if (entry.getValue() == minimum){
                System.out.println(entry.getKey() + " has the minimum salary : " + entry.getValue());
            }
        }

        System.out.println("Count of the people who make between 120k ~ 150k = " + countOfHighSalary);

        List<String> lowSalary = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() < 118000){
                lowSalary.add(entry.getKey());
            }

            if (entry.getValue() < 120000){
                entry.setValue(entry.getValue() + 10000);
            }
        }
        System.out.println("Employees with low salary : " + lowSalary);

        System.out.println(map);


    }
}

        /*
            2.1 who has the maximum and minimum salary?

    2.2 how many employees has the salary between 120k ~ 150K?

    2.3 display the names of the employees who are making less than 118k?

    2.4 increase the salary employee by 10K if the current salary of employee is less than 120K
         */
