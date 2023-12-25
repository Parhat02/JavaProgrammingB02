package week09.day26_statics;

public class day26TasksTest {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Celal", 23, 'M', "C41", "3A", 12, 15);

        student1.study();
        student1.attendClass();
        student1.printSchoolName();
        student1.printProgramLanguage();
        System.out.println(student1.toString());


    }
}
