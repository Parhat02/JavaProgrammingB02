package week06.day17_customClass;

public class Item {

    String name;
    double unitePrice;
    int quantity;

    double totalPrice;
    public void setInfo(String name, double unitePrice, int quantity) {
        this.name = name;
        this.unitePrice = unitePrice;
        this.quantity = quantity;
    }

    public double calculateCost(){
        totalPrice = unitePrice * quantity;
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitePrice=" + unitePrice +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
