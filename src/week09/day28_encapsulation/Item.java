package week09.day28_encapsulation;

public class Item {

    private String name;
    private double unitPrice;
    private int quantity;

    public Item() {
    }

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
//        this.name = name;
//        this.unitPrice = unitPrice;
//        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        boolean hasSpecialChar = false;

        if (name.isBlank() || name.isEmpty()){
            System.err.println("Name can not be empty or blank");
            System.exit(1);
        }
        for (char each:name.toCharArray()){
            if (!Character.isLetterOrDigit(each)){
                if (each == ' '){
                    hasSpecialChar = false;
                }else {
                    hasSpecialChar = true;
                }
            }
        }
        if (hasSpecialChar){
            System.err.println("Name can not contain any special characters other than space, Invalid name: "+name);
            System.exit(1);
        }

        if (!Character.isLetter(name.charAt(0))){
            System.err.println("Name must start with letters, Invalid name: "+name);
            System.exit(1);
        }
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0){
            System.err.println("Unit price can not be negative");
            System.exit(1);
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0){
            System.err.println("Quantity can not be negative");
            System.exit(1);
        }

        if (name.equalsIgnoreCase("toilet paper") && quantity > 1){
            System.err.println("Toilet paper quantity can not be more than 1");
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public double calcCoat(){
        return quantity*unitPrice;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", Total cost=" + calcCoat() +
                '}';
    }
}
