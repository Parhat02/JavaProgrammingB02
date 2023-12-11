package week07.day18_garbageCollection;

public class Carpet {


    double width, length, unitPrice;
    boolean isPersian;

    double totalPrice;
    public void setInfo(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }
    public void calcCost(){
        totalPrice = (width*length) * unitPrice;
        if (isPersian){
            totalPrice += 200;
        }
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice=" + totalPrice +
                '}';
    }


    public static void main(String[] args) {
        Carpet carpet = new Carpet();
        carpet.setInfo(5,5,5,true);
        carpet.calcCost();
        System.out.println(carpet.toString());
    }
}

/*
4. Create a class named Carpet:
	 		Attributes:
                width
                length
                unitPrice
                isPersian


            Actions:
        		setInfo(): sets all the fields
                calcCost(): should be able to calculate the total cost of the carpet and return it as double
                toString(): should be able to display all the info about the carpet including the total cost of the carpet as calculated by calcCost()


		    total price of carpet = (width*length) * unit-price

		    if the carpet is Persian  carpet, add 200$ to the totalPrice

 */