package week10.day30_inheritance.typesOfInheritance;

import java.time.LocalDate;

public class Employee extends Person{

    private String jobTitle;
    private String employeeId;
    private double salary;

    public Employee(String name, char gender, LocalDate DOB, String jobTitle, String employeeId, double salary) {
        super(name, gender, DOB);
        setJobTitle(jobTitle);
        setEmployeeId(employeeId);
        setSalary(salary);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(getName() + " is working.");
    }

}
