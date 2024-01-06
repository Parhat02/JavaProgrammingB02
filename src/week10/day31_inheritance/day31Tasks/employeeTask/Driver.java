package week10.day31_inheritance.day31Tasks.employeeTask;

public class Driver extends Employee{

    public Driver(String name, int age, char gender, int id, String jobTitle, String companyName, double salary) {
        super(name, age, gender, id, jobTitle, companyName, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is driving.");
    }
}