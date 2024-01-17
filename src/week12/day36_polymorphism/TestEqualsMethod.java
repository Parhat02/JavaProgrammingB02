package week12.day36_polymorphism;

public class TestEqualsMethod {

    public static void main(String[] args) {

        Circle circle = new Circle(5);

        Circle circle1 = new Circle(5);

        Circle circle2 = new Circle(15);

        System.out.println(circle1 == circle); //false

        System.out.println(circle1.equals(circle));

        System.out.println(circle1.equals(circle2));

        System.out.println("------------------------------------------------------------");

        IPhone iphone1 = new IPhone("Apple", "Iphone 12", "Medium", "Black", 900);

        IPhone iphone2 = new IPhone("Apple", "Iphone 12", "Medium", "White", 900);

        System.out.println( iphone1.equals(iphone2) );


    }
}
