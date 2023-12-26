package week09.day26_statics;

public class Day26TasksTest {

    public static void main(String[] args) {

        //Task1
        CydeoStudent student1 = new CydeoStudent("Celal", 23, 'M', "C41", "3A", 12, 15);

        student1.study();
        student1.attendClass();
        student1.printSchoolName();
        student1.printProgramLanguage();
        System.out.println(student1.toString());

        System.out.println("---------------------------------------------------------------");

        //Task2

        Circle circle1 = new Circle(3.5);
        Circle circle2 = new Circle(5);
        Circle circle3 = new Circle(7);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        System.out.println(circle1.pi);
        System.out.println(circle2.pi);
        System.out.println(circle3.pi);

        System.out.println(Circle.pi);


        System.out.println("---------------------------------------------------------------");

        //Task3

        Person person = new Person("Jack", 25, 'M');
        person.eat();
        person.drink();
        person.sleep();
        System.out.println(person.toString());

        System.out.println("---------------------------------------------------------------");

        //Task4


    }
}
