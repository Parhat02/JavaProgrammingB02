package week10.day31_inheritance.day31Tasks.studentTask;

public class UnderGraduatedStudents extends Student{

    private boolean isGraduated = false;

    public UnderGraduatedStudents(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender, studentId, fieldOfStudy, schoolName, grade);
    }

    public boolean isGraduated() {
        return isGraduated;
    }

    public void setGraduated(boolean graduated) {
        isGraduated = graduated;
    }

    @Override
    public void study() {
        System.out.println(getName() + " is still studying.");
    }
}
