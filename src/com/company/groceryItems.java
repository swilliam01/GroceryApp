package com.company;

public class groceryItems {

    private String itemName;
    private double itemPrice;
    private int itemQuantity;

    public groceryItems(String itemName, double itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public groceryItems() {
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getItemCost() {
        double itemCost = itemPrice * itemQuantity;

        return itemCost;
    }


    public double getTotalPurchase(double itemCost) {

        return itemCost;
    }

}
