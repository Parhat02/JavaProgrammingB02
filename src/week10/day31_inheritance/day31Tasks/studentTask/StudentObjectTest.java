package week10.day31_inheritance.day31Tasks.studentTask;

public class StudentObjectTest {

    public static void main(String[] args) {

        CydeoStudent student = new CydeoStudent("John", 25,'M',"B02","Programming","Cydeo",
                'A', "Java", 2, 9);

        student.eat();
        student.drink();
        student.sleep();
        student.study();

        System.out.println(student.toString());


        System.out.println("-------------------------------------------------------------------------");


        GraduatedStudent graduatedStudent = new GraduatedStudent("Wick",41, 'M',"2018",
                "Engineer", "YTU", 'A');

        graduatedStudent.study();
        graduatedStudent.sleep();
        System.out.println(graduatedStudent.toString());
    }
}
