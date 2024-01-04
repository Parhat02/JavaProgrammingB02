package week10.day31_inheritance.day31Tasks.studentTask;

public class Student extends Person{

    private String studentId, fieldOfStudy, schoolName;
    private char grade;

    public Student(String name, int age, char gender, String studentId, String fieldOfStudy, String schoolName, char grade) {
        super(name, age, gender);
        setStudentId(studentId);
        setFieldOfStudy(fieldOfStudy);
        setSchoolName(schoolName);
        setGrade(grade);
    }

    public String getStudentId() {
        if (studentId == null){
            System.err.println("The studentId should not be set to null.");
            System.exit(1);
        }
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId.isEmpty()){
            System.err.println("The studentId should not be empty.");
            System.exit(1);
        }
        this.studentId = studentId;
    }

    public String getFieldOfStudy() {
        if (fieldOfStudy == null){
            System.err.println("The fieldOfStudy should not be set to null.");
            System.exit(1);
        }
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if (fieldOfStudy.isEmpty()){
            System.err.println("The fieldOfStudy should not be empty.");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getSchoolName() {
        if (schoolName == null){
            System.err.println("The schoolName should not be set to null.");
            System.exit(1);
        }
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        if (schoolName.isEmpty()){
            System.err.println("The schoolName should not be empty.");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F'){
            this.grade = grade;
        }else {
            System.err.println("Gender must be valid.");
            System.exit(1);
        }

    }

    public void study(){
        System.out.println(getName() + " is studying.");
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", studentId='" + studentId + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
