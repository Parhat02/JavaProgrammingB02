package week06.week6_review;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public String batch;
    public static String school = "Cydeo";

    public void setInfo(String name, int age, char gender, String batch) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.batch = batch;
    }

    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", batch='" + batch + '\'' +
                '}';
    }
}
