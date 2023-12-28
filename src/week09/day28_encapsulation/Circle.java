package week09.day28_encapsulation;

public class Circle {

    private double radius;

    public static double pi = 3.14;

    public Circle(double radius) {
        setRadius(radius);
        //this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            System.err.println("The radius of the circle can not be zero or negative");
            System.exit(1);
        }
        this.radius = radius;
    }

    public double calcArea(){
        return radius*radius*pi;
    }

    public double calcPerimeter(){
        return 2*radius*pi;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "Area=" + calcArea() +
                "Perimeter=" + calcPerimeter() +
                '}';
    }
}
