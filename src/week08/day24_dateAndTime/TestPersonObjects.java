package week08.day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjects {

    public static void main(String[] args) {

        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person() };
        people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 2, 25));
        people[1].setInfo("John", 'F', LocalDate.of(1996, 3, 21));
        people[2].setInfo("Wick", 'M', LocalDate.of(1960, 4, 24));
        people[3].setInfo("Walter", 'F', LocalDate.of(1964, 5, 27));
        people[4].setInfo("Stephen", 'M', LocalDate.of(1999, 6, 22));


        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll( Arrays.asList(people) );

        // print name & date of birth of each person object
        for (Person person : studentsList) {
            System.out.println(person.name);
            System.out.println(person.dateOfBrith);
            System.out.println();
            //System.out.println(person);
        }

        System.out.println("---------------------------------------------");
        // remove all the person object that has the age > 55
        studentsList.removeIf(person -> person.age > 55);
        System.out.println(studentsList);
    }
}
