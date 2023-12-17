package week07.week07_review;

public class Item {

    public String itemName;
    public int quantity;
    public double unitPrice;

    public void setInfo(String itemName, int quantity, double unitPrice){
        this.itemName = itemName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double calcCost(){
        return quantity*unitPrice;
    }

    @Override
    public String toString() { //Jason
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + calcCost()+
                '}';
    }
}

/*
Create a class named Item with the following requirements:
	Attributes:
		itemName: contains the name of the item.
		quantity: contains the quantity of the item.
		unitPrice: contains the unit price of the item.

	Actions:
		setInfo(): sets all the attributes of the item.
		calcCost(): calculates the total cost of the item.
		toString(): displays the full information of the item object, including the total cost of the item calculated by calcCost.
 */
