package week06.day17_customClass;

public class Student {

    String name;
    String gender;
    int age;
    int studentId;
    int grade;

    boolean isFullTime;

    public void setInfo(String name, String gender, int age, int studentId, int grade, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.studentId = studentId;
        this.grade = grade;
        this.isFullTime = isFullTime;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", studentId=" + studentId +
                ", grade=" + grade +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void study(){
        System.out.println(name + " is studying");
    }
}
