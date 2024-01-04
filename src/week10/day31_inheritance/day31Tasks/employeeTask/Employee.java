package week10.day31_inheritance.day31Tasks.employeeTask;

public class Employee {

    private String name;
    private int age;
    private char gender;
    private int Id;
    private String jobTitle, companyName;
    private double salary;


    public Employee(String name, int age, char gender, int id, String jobTitle, String companyName, double salary) {
        setName(name);
        setAge(age);
        setGender(gender);
        setId(id);
        setJobTitle(jobTitle);
        setCompanyName(companyName);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18){
            System.err.println("Age can not be less than 18.");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {

        if (gender == 'M' || gender == 'F'){
            this.gender = gender;
        }else {
            System.err.println("Gender can only be set to 'M' or 'F'.");
            System.exit(1);
        }
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0){
            System.err.println("salary can not be negative.");
            System.exit(1);
        }
        this.salary = salary;
    }

    public void work(){
        System.out.println(name + " is working");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", Id=" + Id +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
