package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double itemCost;
        double totalPurchase = 0;
        String itemName = "";
        String response = "";
        ArrayList <groceryItems> gor1 = new ArrayList<>();

        groceryItems g = new groceryItems();
        do {
            System.out.println("Enter the item name :");
             itemName = keyboard.next();
            System.out.println("Enter the price :");
            double price = keyboard.nextDouble();
            System.out.println("Add the quantity :");
            int quantity = keyboard.nextInt();

           //  itemCost = g.getItemCost();

//             totalPurchase = g.getTotalPurchase(itemCost);

             gor1.add(new groceryItems(itemName, price, quantity));
            System.out.println("Do you want to add another item (yes or no) :");
             response =keyboard.next();

        }while (!response.equalsIgnoreCase("no"));
                     System.out.println("Item Name" + "\t" + "Price" + "\t" + "Quantity" + "\t" + "Cost");
        int counter =0;
        for (groceryItems grocer2 : gor1) {
            System.out.println(grocer2.getItemName() + "\t\t" + grocer2.getItemPrice() + "\t\t" + grocer2.getItemQuantity() + "\t\t"+ grocer2.getItemCost());
            totalPurchase = totalPurchase + grocer2.getItemCost(); counter++;
        }


      System.out.println("Total Purchase Amount = $"+totalPurchase);
        System.out.println("Total Items purchased = " + counter);


    }
}
