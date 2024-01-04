package week10.day31_inheritance.day31Tasks.employeeTask;

public class TestEmployeeObject {


    public static void main(String[] args) {

        Developer developer = new Developer("Star", 29, 'M', 20240201,"Developer",
                "Apple", 145000, "Java");

        developer.work();
        System.out.println(developer.toString());

    }
}
