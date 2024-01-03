package week10.day31_inheritance.shape_methodOverriding;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * 3.14;
    }

    @Override
    public double perimeter() {
        return 3.14*2*radius;
    }

    @Override
    public void draw() { // draft/ not completed yet/ only works for radius = 2;
        super.draw();

        int r = (int)radius;
        String a = "* *";
        for (int i = 1; i <= r; i++) {
            if (i==1){
                System.out.println("  "+a);
                continue;
            }
            a = a + " " + a;
            System.out.println(a);
            System.out.println(a);
        }
        a = "* *";
        System.out.println("  "+a);
    }

    @Override
    public String toString() {
        return super.toString().replace("}","") +
                ", radius=" + radius +
                '}';
    }
}
