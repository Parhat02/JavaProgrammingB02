package week10.day31_inheritance.shape_methodOverriding;

public class TestShapeObject {

    public static void main(String[] args) {

        Square square = new Square(5);

        System.out.println(square);

        square.draw();

        System.out.println("----------------------------");

        Circle circle = new Circle(2);

        System.out.println(circle);

        circle.draw();
    }
}
