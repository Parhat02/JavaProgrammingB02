package week12.day38_exceptions.shapeTask;

public class TestShapeObject {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);

        //circle1.setRadius(0);

        circle1.setRadius(-5);
    }
}
