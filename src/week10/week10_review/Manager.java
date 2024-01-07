package week10.week10_review;

import week10.day31_inheritance.day31Tasks.employeeTask.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class Manager extends Employee {

    private String department;

    public Manager(String name, int age, char gender, int id, String jobTitle, String companyName, double salary, String department) {
        super(name, age, gender, id, jobTitle, companyName, salary);
        this.department = department;
    }

    public Manager(String name, int age, char gender, int id, double salary, String department) {
        super(name, age, gender, id, salary);
        setDepartment(department);
    }

    public Manager(String name, int age, char gender, int id, String department) {
        super(name, age, gender, id);
        setDepartment(department);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + getDepartment());
    }

    @Override
    public void work() {
        System.out.println("Manager "+getName()+" is managing "+getDepartment());
    }
}
