package week09.day26_statics;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;
    public String id;
    public String grade;
    public int batchNumber;
    public int groupNumber;

    public static String schoolName = "Cydeo";
    public static String magicWord = "Java";

    public CydeoStudent(String name, int age, char gender, String id, String grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public void attendClass(){
        System.out.println(name + " is attending class "+batchNumber);
    }

    public void printSchoolName(){
        System.out.println("School name is : " + schoolName);
    }

    public void printProgramLanguage(){
        System.out.println("Programing language is : " + magicWord);
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", grade='" + grade + '\'' +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", school name=" + schoolName +
                ", program language=" + magicWord +
                '}';
    }
}
