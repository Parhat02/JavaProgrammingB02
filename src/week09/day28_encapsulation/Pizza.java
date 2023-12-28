package week09.day28_encapsulation;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping;
    private int numberOfPepperoniTopping;

    public Pizza() {
    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
//        this.size = size;
//        this.numberOfCheeseTopping = numberOfCheeseTopping;
//        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if (!(size.equalsIgnoreCase("large")||size.equalsIgnoreCase("medium")||
                size.equalsIgnoreCase("small"))){
            System.err.println("The size of the pizza can only be small, medium, or large.");
            System.exit(1);
        }
        this.size = size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping < 0){
            System.err.println("The size of the pizza can only be small, medium, or large.");
            System.exit(1);
        }
        if ((size.equalsIgnoreCase("small")&&numberOfCheeseTopping>3)||
                (size.equalsIgnoreCase("medium")&&numberOfCheeseTopping>4)||
                (size.equalsIgnoreCase("large")&&numberOfCheeseTopping>5)){
            System.err.println("the maximum number of cheese toppings is:\n" +
                    "                                        small: 3\n" +
                    "                                        medium: 4\n" +
                    "                                        large: 5\n");
            System.exit(1);
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (numberOfPepperoniTopping < 0){
            System.err.println("The size of the pizza can only be small, medium, or large.");
            System.exit(1);
        }
        if ((size.equalsIgnoreCase("small")&&numberOfPepperoniTopping>4)||
                (size.equalsIgnoreCase("medium")&&numberOfPepperoniTopping>5)||
                (size.equalsIgnoreCase("large")&&numberOfPepperoniTopping>6)){
            System.err.println("the maximum number of pepperoni toppings is:\n" +
                    "                                        small: 4\n" +
                    "                                        medium: 5\n" +
                    "                                        large: 6\n");
            System.exit(1);
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost(){
        double cost = 0;
        if (size.equalsIgnoreCase("small")){
            cost = 10 + 2*(numberOfCheeseTopping+numberOfPepperoniTopping);
        }
        if (size.equalsIgnoreCase("medium")){
            cost = 12 + 2*(numberOfCheeseTopping+numberOfPepperoniTopping);
        }
        if (size.equalsIgnoreCase("large")){
            cost = 14 + 2*(numberOfCheeseTopping+numberOfPepperoniTopping);
        }
        return cost;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", Total cost =" + calcCost() +
                '}';
    }
}
