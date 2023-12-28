package week09.day28_encapsulation;

public class Square {

    private int side;


    public Square(int side) {
        setSide(side);
        //this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {

        if (side < 0){
            System.err.println("The side of the square should not be negative");
            System.exit(1);
        }
        this.side = side;
    }

    public double calcArea(){
        return side*side;
    }

    public double calcPerimeter(){
        return 4*side;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "side=" + side +
                "Area=" + calcArea() +
                "Perimeter=" + calcPerimeter() +
                '}';
    }
}
