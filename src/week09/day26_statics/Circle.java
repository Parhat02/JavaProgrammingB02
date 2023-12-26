package week09.day26_statics;

public class Circle {

    public double radius;
    public double diameter;
    public static double pi = 3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
        diameter = radius*2;
    }

    public double calcArea(){
        return pi*radius*radius;
    }

    public double calcPerimeter(){
        return pi*diameter;
    }

    public  static void printPiValue() {
        System.out.println("PI' value is: " + pi);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                ", pi=" + pi +
                ", Area=" + calcArea() +
                ", Perimeter=" + calcPerimeter() +
                '}';
    }
}
