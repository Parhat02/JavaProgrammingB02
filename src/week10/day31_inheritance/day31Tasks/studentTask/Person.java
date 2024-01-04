package week10.day31_inheritance.day31Tasks.studentTask;

public class Person {

    private String name;
    private int age;

    private char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {

        if (name == null){
            System.err.println("The name should not be set to null.");
            System.exit(1);
        }
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            System.err.println("The name should not be empty.");
            System.exit(1);
        }
        for (char each : name.toCharArray()){
            if (!Character.isLetterOrDigit(each) && (each != ' ')){
                System.err.println("The name should not contain any special character other than space.");
                System.exit(1);
            }
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0){
            System.err.println("Age should not be set to negative.");
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
            System.err.println("Gender must be valid.");
            System.exit(1);
        }

    }

    public void eat(){
        System.out.println(name + " is eating.");
    }

    public void drink(){
        System.out.println(name + " is drinking.");
    }

    public void sleep(){
        System.out.println(name + " is sleeping.");
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
