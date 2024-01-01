package week10.day29_inheritance.carTask;

public class TestCars {

    public static void main(String[] args) {

        Toyota toyota = new Toyota();

        toyota.setInfo("Corolla","Black", 2023, 30000.00);

        System.out.println(toyota.toString());

        System.out.println("--------------------------------------------------------------------");

        BMW bmw = new BMW();
        bmw.setInfo("i6","Blue", 2023, 60000);
        System.out.println(bmw);

        System.out.println("--------------------------------------------------------------------");

        Audi audi = new Audi();
        audi.setInfo("A6","White", 2024, 70000);
        System.out.println(audi);
    }
}
