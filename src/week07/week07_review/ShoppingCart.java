package week07.week07_review;

import java.util.Arrays;

public class ShoppingCart {

    public Item[] items = new Item[10]; //[null, null, null, null, null, null, null, null, null, null]
    public int itemCount;

    public void addItem(Item item) { // should be able to add an item to the Items array
        if (itemCount < items.length) { // as long as the last index hasn't reached
            items[itemCount++] = item; // set the item object to the index' of the array
            System.out.println(item.itemName + " added to the shopping cart");
        } else {
            System.err.println("Cannot add more items, Shopping cart is full");
            System.exit(1);
        }
    }

    public void displayCart() {

        if (Arrays.equals(items, new Item[10])) {
            System.out.println("Your cart is empty");
            return;
        }

        System.out.println("Your Shopping Cart:");

        double totalCost = 0;

        for (Item eachItem : items) {
            if (eachItem != null) {
                System.out.println("\t-----------------");
                System.out.println("\tItem name: " + eachItem.itemName);
                System.out.println("\tUnit price: $" + eachItem.unitPrice);
                System.out.println("\tQuantity: " + eachItem.quantity);
                totalCost += eachItem.calcCost();

            }
        }

        System.out.println("\t======================");
        System.out.println("\tTotal Cost is: $" + totalCost);
    }




}
/*
Create a class named ShoppingCart and write a program with the following requirements that can simulate the
online shopping cart application with a maximum of 10 items in it:

	Attributes:
		items[]: an array of items, with a maximum size set to 10.
		itemCount: used for counting the number of items that are added to the shopping cart.

	Actions:
		addItem(Item): adds the given item to the shopping cart as long as there are fewer than 10 items in the cart.
		displayCart(): displays the name, unit price, and quantity of each item and the total cost.
 */