package week06.day17_customClass;

public class Test {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        rectangle.setInfo(4,5);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        System.out.println(rectangle);

        System.out.println("--------------------------------------------");

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        salaryCalculator.setInfo(40,40,10,5);
        salaryCalculator.salary();
        salaryCalculator.stateTax();
        salaryCalculator.federalTax();
        salaryCalculator.salaryAfterTax();
        System.out.println(salaryCalculator);

        System.out.println("--------------------------------------------");

        Item item = new Item();
        item.setInfo("Phone", 1500, 3);
        double totalCost = item.calculateCost();
        System.out.println(item);

    }
}
