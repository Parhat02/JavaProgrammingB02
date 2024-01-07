package week10.day31_inheritance.day31Tasks.employeeTask;

public class Developer extends Employee{

    private String programmingLanguage;

    public Developer(String name, int age, char gender, int id, String jobTitle, String companyName,
                     double salary, String programmingLanguage) {
        super(name, age, gender, id, jobTitle, companyName, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public Developer(String name, int age, char gender, int id, String programmingLanguage) {
        super(name, age, gender, id);
        setProgrammingLanguage(programmingLanguage);
    }

    public Developer(String name, int age, char gender, int id, double salary, String programmingLanguage) {
        super(name, age, gender, id, salary);
        setProgrammingLanguage(programmingLanguage);
    }

    public Developer(String name, int age, char gender, int id, double salary) {
        super(name, age, gender, id, salary);
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void work() {
        System.out.println(getName() + " is coding in "+programmingLanguage);
    }
}
