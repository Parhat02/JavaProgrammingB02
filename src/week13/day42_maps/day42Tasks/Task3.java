package week13.day42_maps.day42Tasks;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Task3 {

    public static void main(String[] args) {

        Map<String, LocalDate> map = new LinkedHashMap<>();
        map.put("John", LocalDate.of(2018, 9, 5));
        map.put("Antony", LocalDate.of(2012, 7, 29));
        map.put("Jimmy", LocalDate.of(2014, 4, 1));
        map.put("James", LocalDate.of(2016, 11, 2));
        map.put("Josh", LocalDate.of(2020, 5, 15));
        map.put("Cory", LocalDate.of(2015, 6, 19));
        map.put("Anderson", LocalDate.of(2013, 8, 24));
        map.put("Steven", LocalDate.of(2017, 10, 2));

        List<String> before2015 = new LinkedList<>();

        List<String> after2014 = new LinkedList<>();

        for (Map.Entry<String, LocalDate> dateEntry : map.entrySet()) {

            if (dateEntry.getValue().isBefore(LocalDate.of(2015, 1, 1))){
                before2015.add(dateEntry.getKey());
            }

            if (dateEntry.getValue().isEqual(LocalDate.of(2020, 5, 15))){
                System.out.println("Employee who is hired on 15/05/2020 : " + dateEntry.getKey());
            }

            if (dateEntry.getValue().isAfter(LocalDate.of(2014, 1, 1))){
                after2014.add(dateEntry.getKey());
            }

        }

        System.out.println("Employees who hired before 2015 : " + before2015);

        System.out.println("Employees who hired after 2014 : " + after2014);

        System.out.println(map);

        map.forEach((k,v) -> {
            System.out.println(k + " : " + v);
        });


    }
}

/*
        3.1 Display the names of the employee who were hired before 2015
                    Hint: You can use isBefore method of LocalDate

        3.2 Display the name of the employee who were hired on 5/15/2020
                    Hint: You can use isEqual method of LocalDate

        3.3 How many people were hired after 2014?
                    Hint: You can use isAfter method of LocalDate

        3.4 Display the name and hire date of the employee
 */