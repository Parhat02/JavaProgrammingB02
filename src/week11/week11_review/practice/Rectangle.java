package week11.week11_review.practice;

public class Rectangle extends Shape{

    private double width, length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double calcArea() {
        return getWidth()*getLength();
    }

    @Override
    public double calcPerimeter() {
        return 2*(getWidth()+getLength());
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle with the length of " + getLength() +" and with width of " +getWidth());
    }
}
