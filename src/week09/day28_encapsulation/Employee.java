package week09.day28_encapsulation;

public class Employee {

    private String name;
    private double salary;

    public int age;
    private String jobTitle;

    public Employee() {
    }

    public Employee(String name, int age, String jobTitle, double salary) {
        setName(name);
        setAge(age);
        this.jobTitle = jobTitle;
        this.salary = salary;
//        this.name = name;
//        this.age = age;

    }

    public String getName() {

        if (name == null){
            name = "Unknown";
        }
        return name;
    }

    public void setName(String name) {

        if (name.isEmpty() || name.isBlank()){
            System.err.println("Employee name can not be empty or blank");
            System.exit(1);
        }
        this.name = name;
    }
    public double getSalary() {
        if (salary == 0){
            System.err.println("Salary has not been set");
            System.exit(1);
        }
        return salary;
    }

    public void setSalary(double salary) {

        if (salary < 0){
            System.err.println("Salary can not been negative: "+salary);
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 16){
            System.err.println("Invalid age: "+age);
            System.exit(1);
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", salary=" + getSalary() +
                ", age=" + getAge() +
                ", jobTitle='" + getJobTitle() + '\'' +
                '}';
    }
}
