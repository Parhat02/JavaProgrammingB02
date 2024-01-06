package week10.day31_inheritance.day31Tasks.studentTask;

public class GraduatedStudent extends Student{

    private boolean isGraduated = true;
    public GraduatedStudent(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade) {
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
        System.out.println(getName() + " has already graduated.");
    }

    @Override
    public String toString() {
        return super.toString().replace("}","") +
                ", isGraduated=" + isGraduated +
                '}';
    }
}