package week10.day29_inheritance.day29Tasks;

public class TestWorkers {

    public static void main(String[] args) {

        Tester tester = new Tester();
        tester.setInfo("John", 'M', 45, "A123456", "Tester", 110000);

        System.out.println(tester);
        tester.testing();

        System.out.println("---------------------------------------------------------------------------------------");

        Developer developer = new Developer();
        developer.setInfo("Wick", 'M', 55, "A456789", "Developer", 135000, "Java");

        System.out.println(developer);
        developer.coding();

        System.out.println("---------------------------------------------------------------------------------------");

        Teacher teacher = new Teacher();
        teacher.setInfo("Sophey", 'F', 32, "A987654", "Teacher", 85000);

        System.out.println(teacher);
        teacher.teaching();

        System.out.println("---------------------------------------------------------------------------------------");

        Driver driver = new Driver();
        driver.setInfo("Jonny", 'M', 35, "A770011", "driver", 75000);

        System.out.println(driver);
        driver.driving();

    }
}
