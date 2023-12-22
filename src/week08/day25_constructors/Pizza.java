package week08.day25_constructors;

public class Pizza {

    public String size;
    public int numberOfChessTopping;
    public int numberOfPepperoniTopping;

    public Pizza(String size, int numberOfChessTopping, int getNumberOFPepperoniTopping) {
        this.size = size;
        this.numberOfChessTopping = numberOfChessTopping;
        this.numberOfPepperoniTopping= getNumberOFPepperoniTopping;
    }

    public double calcCost(){
        int price = (size.equalsIgnoreCase("small"))? 10 : (size.equalsIgnoreCase("medium"))? 12 : 14;
        return price + 2*numberOfChessTopping+2*numberOfPepperoniTopping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfChessTopping=" + numberOfChessTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total cost=" + calcCost()+
                '}';
    }
}
