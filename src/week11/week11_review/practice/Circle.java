package week11.week11_review.practice;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return (getRadius() * getRadius()) * Math.PI;
    }

    @Override
    public double calcPerimeter() {
        return 2 * getRadius() * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with the radius of " +getRadius());
    }
}
