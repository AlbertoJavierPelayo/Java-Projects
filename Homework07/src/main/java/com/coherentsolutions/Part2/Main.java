package com.coherentsolutions.Part2;

public class Main {
    public static void main(String[] args) {
        /* create the inventory management system */
        InventoryManagement inventoryManagement = new InventoryManagement();

        /* add products to the system */
        inventoryManagement.addProduct("Laptop", 10);
        inventoryManagement.addProduct("Mouse", 6);
        inventoryManagement.addProduct("Monitor", 2);
        inventoryManagement.addProduct("Keyboard", 15);

        /* Display the initial inventory after adding the products */
        System.out.println("Displaying the initial inventory:");
        inventoryManagement.displayInventory();
        System.out.println();

        /* Update a product (laptop) and display the inventory after the update */
        inventoryManagement.updateQuantity("Laptop",7);
        System.out.println("Displaying inventory after update the quantity in laptop product:");
        inventoryManagement.displayInventory();
        System.out.println();

        /* Display the product that are low in stock */
        inventoryManagement.alertLowStockProducts();
        System.out.println();

        /* Remove a product (Mouse) and display the inventory after remove */
        inventoryManagement.removeProduct("Mouse");
        System.out.println("Displaying the inventory after delete mouse product");
        inventoryManagement.displayInventory();
        System.out.println();


    }
}