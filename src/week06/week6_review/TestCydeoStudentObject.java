package week06.week6_review;

public class TestCydeoStudentObject {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent();
        student1.name = "Ayse";
        student1.age = 25;
        student1.gender = 'F';
        student1.batch = "JD Batch 2";

        CydeoStudent student2 = new CydeoStudent();
        student2.setInfo("James", 45, 'M', "SDET batch 10");

        CydeoStudent student3 = new CydeoStudent();
        student3.setInfo("Yulia", 30, 'F', "CS Batch 4");

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);


    }
}
