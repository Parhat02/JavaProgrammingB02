package week12.week12_review;


import week10.day31_inheritance.shape_methodOverriding.Circle;
import week10.day31_inheritance.shape_methodOverriding.Shape;
import week10.week10_review.Developer;
import week10.week10_review.Employee;
import week10.week10_review.Manager;
import week10.week10_review.Person;


public class ReferenceTypeCasting {

    public static void main(String[] args) {

        Object obj1 = new Circle(4); // Object Type: Circle, Reference: Object

        Shape shape = (Shape) obj1; // Object Type: Circle, Reference: Shape

        Circle circle = (Circle) shape; // // Object Type: Circle, Reference: Circle

        //System.out.println(shape.calcArea());
        System.out.println(circle.getRadius());

        System.out.println(((Circle) shape).getRadius());

        // System.out.println(shape.getRadius());

        // System.out.println( ( (Cube)shape).calcVolume()  );



        System.out.println("-------------------------------");

        Person person = new Person("Joshua", 25);
        Employee employee = new Employee("Edward Cruz", 30, "Male", "A01", 120_000);
        Developer developer = new Developer("Dauren", 35, "Male", "A02", 130_000, "Python");
        Manager manager = new Manager("Mariia", 30, "Female", "A03", 130_000, "IT Department");


        Person[] arr = {person, employee, developer, manager};

        for (Person each : arr) {
            if( each instanceof Employee ){
                System.out.println(each.getName() + " : " + each.getAge() + " : "+ ((Employee) each).getSalary());
            }else {
                System.out.println(each.getName() + " : " + each.getAge());
            }
        }
    }
}
