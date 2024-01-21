package week10.week10_review;

public class Employee extends Person{

    private String employeeId;
    private double salary;

    public Employee(String name, int age, String gender, String employeeId, double salary) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setSalary(salary);
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
        System.out.println(getClass().getSimpleName() + " "  + getName() + " is working" );
    }

    public void displayInfo(){
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Gender: " + getGender());
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Salary: $" + getSalary());
    }
}
