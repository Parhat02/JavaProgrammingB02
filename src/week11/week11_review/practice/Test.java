package week11.week11_review.practice;

import org.w3c.dom.css.Rect;

public class Test {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5.5, 7.5);

        System.out.println(rectangle);
        System.out.println(rectangle.getName());
        System.out.println(rectangle.calcArea());

        System.out.println("----------------------------------");

        Circle circle = new Circle(5);
        System.out.println(circle);
        System.out.println(circle.getName());
        System.out.println(circle.calcArea());

        System.out.println("----------------------------------");

        Cube cube = new Cube(6);

        System.out.println(cube);

        System.out.println("------------------------------------");

        Cylinder cylinder = new Cylinder(4, 2);

        System.out.println(cylinder);

        System.out.println("------------------------------------");



        // Polymorphism:

        Shape shape;

        shape = new Circle(10.5);

        System.out.println(shape);
        System.out.println(((Circle)shape).getRadius());
        System.out.println(shape.calcArea());
        System.out.println(shape.calcPerimeter());


        shape = new Cube(5.5);

        System.out.println(shape);
        System.out.println(((Cube)shape).getSide());
        System.out.println(shape.calcArea());
        System.out.println(shape.calcPerimeter());
        System.out.println(((Cube)shape).calcVolume());


        shape = new Rectangle(30, 40);
        System.out.println(shape);
        System.out.println(((Rectangle) shape).getWidth());
        System.out.println(((Rectangle) shape).getLength());

        //System.out.println( ((Cube) shape).calcVolume());

        System.out.println("------------------------------------");

        Shape[] shapes = {circle, rectangle, cube, cylinder};

        for (Shape eachShape : shapes) {
            System.out.println(eachShape);
        }

        System.out.println("------------------------------------");

        Volume shape2;

        shape2 = new Cube(2);

        System.out.println(((Cube) shape2).calcArea());

        // shape2 = new Circle(6);


    }
}
