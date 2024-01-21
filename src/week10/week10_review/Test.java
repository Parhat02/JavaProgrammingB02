package week10.week10_review;



public class Test {

    public static void main(String[] args) {

        Person person = new Person("Joshua", 25);

        //person.setAge(25);

        System.out.println(person.toString());

        System.out.println( person.getName().toUpperCase() );
        System.out.println(person.getAge());
        System.out.println(person.getGender()+"".toUpperCase() );

        System.out.println("--------------------------------------------");

        Employee employee = new Employee("Edward Cruz", 30, "Male", "A101", 120_000);

        System.out.println(employee.toString());

        employee.work();
        employee.displayInfo();

        System.out.println("--------------------------------------------");

        Developer developer = new Developer("Dauren", 35, "Male", "A102", 130000 , "Python");

        System.out.println(developer);

        developer.displayInfo();

        developer.work();

        // developer.setProgrammingLanguage("HTML");

        System.out.println(developer);

        System.out.println("--------------------------------------------");

        Manager manager = new Manager("Mariia", 30, "Female", "A03", 130_000, "IT Department");

        System.out.println(manager);

        manager.displayInfo();
        manager.work();

        System.out.println("------------------------------------------------------------------------------------");

        Company company = new Company("Google Inc", "New York");

        System.out.println(company);

        // company.hireEmployee(null);
        company.hireEmployee(developer);
        company.hireEmployee(manager);
        company.hireEmployee( new Developer("Feyyaz", 36, "Male", "A05", 115_000));
        company.hireEmployee(new Manager("Erfan", 42, "Male", "A07", 150_000, "HR Department"));

        Employee[] employees = {developer, manager};

        company.hireEmployee(employees);

        System.out.println(company);

        company.fireEmployee("A102");

        System.out.println(company);

        company.displayEmployeesInfo();


        System.out.println("-----------------------------------------------");

        String[] employeeIds = {"A02", "A07"};

        company.fireEmployee(employeeIds);

        System.out.println(company);
        company.displayEmployeesInfo();
    }
}
