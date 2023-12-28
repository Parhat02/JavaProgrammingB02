package week09.day28_encapsulation;

public class TestStudent {

    public static void main(String[] args) {

        Student student = new Student();


        student.setAge(25);

        System.out.println(student.getAge());

        student.setName("Aaron123");

        System.out.println(student.getName());

    }
}
