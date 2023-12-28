package week09.day28_encapsulation;

public class Rectangle {

    private int width;
    private int length;

    public Rectangle(int width, int length) {
        setWidth(width);
        setLength(length);

//        this.width = width;
//        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width < 0){
            System.err.println("The width of the rectangle should not be negative");
            System.exit(1);
        }
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length < 0){
            System.err.println("The length of the rectangle should not be negative");
            System.exit(1);
        }
        this.length = length;
    }

    public double calcArea(){
        return width*length;
    }

    public double calcPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "width=" + width +
                "length=" + length +
                "Area=" + calcArea() +
                "Perimeter=" + calcPerimeter() +
                '}';
    }
}
