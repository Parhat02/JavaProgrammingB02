package week12.day36_polymorphism;

public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Square)){
            System.err.println("Invalid Object, Object must be square");
            System.exit(1);
        }

        if(side ==  ( (Square)obj ).side ){
            return true;
        }

        return false;
    }
}
