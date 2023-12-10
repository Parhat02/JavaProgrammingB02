package week06.day17_customClass;

public class Rectangle {

    public double length;
    public double width;

    public double areaOfRectangle;
    public double perimeterOfRectangle;

    public void setInfo(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + areaOfRectangle +
                ", perimeter=" + perimeterOfRectangle+
                '}';
    }

    public void calculateArea(){
         areaOfRectangle = length * width;
    }

    public void calculatePerimeter(){
        perimeterOfRectangle = 2 * (length + width);
    }

}
