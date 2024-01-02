package week10.day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Teacher extends Employee{


    public Teacher(String name, char gender, LocalDate DOB, String jobTitle, String employeeId, double salary) {
        super(name, gender, DOB, jobTitle, employeeId, salary);
    }

    public void teach(){
        System.out.println(getName() + " is teaching.");
    }
}
