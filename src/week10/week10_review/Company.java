package week10.week10_review;

import week10.day31_inheritance.day31Tasks.employeeTask.Employee;

import java.util.ArrayList;

public class Company {

    private String companyName, location;
    private ArrayList<Employee> employees = new ArrayList<>(); // read only

    public Company(String companyName) {
        setCompanyName(companyName);
        setLocation("None");
    }

    public Company(String companyName, String location) {
        setCompanyName(companyName);
        setLocation(location);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        if(location == null){
            return "None";
        }
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void hireEmployee(Employee employee){
        if (employee == null){
            throw new RuntimeException("Can not add null key to the employees list.");
            //    System.err.println("Can not add null key to the employees list");
            //   System.exit(1);
        }
        employees.add(employee);
    }

    public void fireEmployee(int id){
        if (id == 0){
            throw new RuntimeException("The id can not be 0");
        }
        employees.removeIf(p-> p.getId() == id);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "companyName='" + companyName + '\'' +
                ", location='" + location + '\'' +
                ", total number of employees=" + employees.size() +
                '}';
    }

    public void displayEmployeesInfo(){
        for (Employee employee : employees) {
            System.out.println("---------------------");
            employee.displayInfo();
        }
    }

}
