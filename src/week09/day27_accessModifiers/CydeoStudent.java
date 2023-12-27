package week09.day27_accessModifiers;

public class CydeoStudent {

    public String name;
    public int age;
    public char gender;


    public static String schoolName;
    public static String secretCode;
    public static String fieldOfStudy;

    public CydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        //  schoolName = "Cydeo School";
        //   secretCode = "Wooden Spoon";
    }

    static{
        schoolName = "Cydeo School";
        secretCode = "Wooden Spoon";
        fieldOfStudy = "Java Developer";
    }

    public void printSchoolName(){
        System.out.println(schoolName);
    }

    public void printSecretCode(){
        System.out.println(secretCode);
    }

    public void attendClass(){
        System.out.println("Attending class : "+fieldOfStudy);
    }

    public void study(){
        System.out.println(name + " is studying");
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}
