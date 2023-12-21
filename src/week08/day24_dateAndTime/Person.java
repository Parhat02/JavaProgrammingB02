package week08.day24_dateAndTime;

import java.time.LocalDate;

public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBrith;

    public void setInfo(String name, char gender, LocalDate dateOfBrith) {
        this.name = name;
        this.gender = gender;
        this.dateOfBrith = dateOfBrith;
        age = LocalDate.now().getYear()-dateOfBrith.getYear();
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBrith=" + dateOfBrith +
                '}';
    }
}
