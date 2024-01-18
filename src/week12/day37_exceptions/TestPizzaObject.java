package week12.day37_exceptions;

import week12.day36_polymorphism.Circle;

public class TestPizzaObject {

    public static void main(String[] args) {

        Pizza pizza1 = new Pizza('S', 2, 3);

        Pizza pizza2 = new Pizza('S', 2, 3);

        System.out.println(pizza1 == pizza2);

        System.out.println(pizza1.equals(pizza2));


        Object obj = new Pizza('S', 4, 3); //upcasting

        boolean r = obj.equals(pizza2);

        System.out.println(r);

        double total =  ( (Pizza)obj).calcCost(); // down casting

        System.out.println(total);

        double area = ( (Circle)obj ).area();

        //   System.out.println(area);

        System.out.println("Test Completed");


    }
}
