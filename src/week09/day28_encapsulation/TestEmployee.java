package week09.day28_encapsulation;

public class TestEmployee {

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setSalary(1000);
        System.out.println(employee.getSalary());

//        employee.setName("          ");
//        System.out.println(employee.getName());


        Employee employee1 = new Employee("Danial", 30, "Java Developer", 120000);

        System.out.println(employee1);
    }
}
