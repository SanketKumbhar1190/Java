package com.cdac.acts.Day5;
/*
3.Write java program for billing of items purchased by customer. 
 Create an Item class with itemCode, itemName, price and quantity along with getters and 
 toString methods.


When customer buy the Item by using item code then
add purchased item in an array. 

For every purchase create item using
Parameterized constructor.
Menus.

1. Display stock
2. BUY item by item code
3. Display bill 
*/
import java.util.Scanner;

class Item {
    private int itemCode;
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public Item(int itemCode, String itemName, double price, int quantity) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public int getItemCode() {
        return itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // To reduce stock quantity after buying
    public void reduceQuantity(int qty) {
        this.quantity -= qty;
    }

    // toString method to display item details
    public String toString() {
        return "Code: " + itemCode + ", Name: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }
}

public class BillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array of stock items
        Item[] stock = {
            new Item(101, "Pen", 10.0, 50),
            new Item(102, "Pencil", 5.0, 100),
            new Item(103, "Notebook", 50.0, 30),
            new Item(104, "Eraser", 3.0, 80)
        };

        // Array for purchased items
        Item[] cart = new Item[100]; // max 100 items customer can buy
        int cartIndex = 0; // to keep track of cart items

        int choice;
        do {
            System.out.println("\nMENU:");
            System.out.println("1. Display Stock");
            System.out.println("2. Buy Item by Code");
            System.out.println("3. Display Bill");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- Stock Available ---");
                    for (Item item : stock) {
                        System.out.println(item);
                    }
                    break;

                case 2:
                    System.out.print("Enter item code to buy: ");
                    int code = sc.nextInt();
                    boolean found = false;

                    for (Item item : stock) {
                        if (item.getItemCode() == code) {
                            found = true;
                            System.out.print("Enter quantity to buy: ");
                            int qty = sc.nextInt();

                            if (qty > 0 && qty <= item.getQuantity()) {
                                // Create new Item for cart using parameterized constructor
                                cart[cartIndex++] = new Item(item.getItemCode(), item.getItemName(), item.getPrice(), qty);
                                item.reduceQuantity(qty); // reduce stock
                                System.out.println("Item added to cart!");
                            } else {
                                System.out.println("Invalid quantity. Only " + item.getQuantity() + " items left in stock.");
                            }
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Item code not found!");
                    }
                    break;

                case 3:
                    double total = 0;
                    System.out.println("\n--- Bill ---");
                    for (int i = 0; i < cartIndex; i++) {
                        Item purchasedItem = cart[i];
                        double itemTotal = purchasedItem.getPrice() * purchasedItem.getQuantity();
                        System.out.println(purchasedItem.getItemName() + " x " + purchasedItem.getQuantity() + " = " + itemTotal);
                        total += itemTotal;
                    }
                    System.out.println("Total Amount: " + total);
                    break;

                case 4:
                    System.out.println("Thank you for shopping!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}









































































































