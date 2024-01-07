package week10.week10_review;

import week10.day31_inheritance.day31Tasks.employeeTask.Developer;
import week10.day31_inheritance.day31Tasks.employeeTask.Employee;
import week10.day31_inheritance.day31Tasks.studentTask.Person;

public class Test {

    public static void main(String[] args) {

        Person person = new Person("Joshua", 25);

        //person.setAge(25);

        System.out.println(person.toString());

        System.out.println( person.getName().toUpperCase() );
        System.out.println(person.getAge());
        System.out.println(person.getGender()+"".toUpperCase() );

        System.out.println("--------------------------------------------");

        Employee employee = new Employee("Edward Cruz", 30, 'M', 101, 120_000);

        System.out.println(employee.toString());

        employee.work();
        employee.displayInfo();

        System.out.println("--------------------------------------------");

        Developer developer = new Developer("Dauren", 35, 'M', 102, 130000 , "Python");

        System.out.println(developer);

        developer.displayInfo();

        developer.work();

        // developer.setProgrammingLanguage("HTML");

        System.out.println(developer);

        System.out.println("--------------------------------------------");

        Manager manager = new Manager("Mariya", 30, 'F', 103, 130_000, "IT Department");

        System.out.println(manager);

        manager.displayInfo();
        manager.work();

        System.out.println("------------------------------------------------------------------------------------");

        Company company = new Company("Google Inc", "New York");

        System.out.println(company);

        // company.hireEmployee(null);
        company.hireEmployee(developer);
        company.hireEmployee(manager);
        company.hireEmployee( new Developer("Feyyaz", 36, 'M', 105, 115_000));
        company.hireEmployee(new Manager("Erfan", 42, 'M', 107, 150_000, "HR Department"));

        System.out.println(company);

        company.fireEmployee(102);

        System.out.println(company);

        company.displayEmployeesInfo();
    }
}
