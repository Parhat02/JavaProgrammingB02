package week10.day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObject {

    public static void main(String[] args) {

        Student student = new Student("Lucy", 'F', LocalDate.of(1998,02,01), 'A',"202101");

        President president = new President("Deniel", 'M', LocalDate.of(1985,11,21), LocalDate.of(2022,05,06));

        Teacher teacher = new Teacher("Emily", 'F', LocalDate.of(1985, 11, 1), "Math Teacher", "C1", 95000);


        System.out.println(student);
        System.out.println(president);
        System.out.println(student);

        student.study();
        president.lie();
        teacher.teach();

        System.out.println("---------------------------------------------------");

        student.eat("Baklava");
        teacher.eat("Kebab");
        president.eat("Donut");

        student.drink("Milk");
        teacher.drink("Tea");
        president.drink("Coffee");
    }



}
