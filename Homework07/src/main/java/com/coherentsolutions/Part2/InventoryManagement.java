package com.coherentsolutions.Part2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * This class represents the inventory management system
 */
public class InventoryManagement {
    //Attribute of the inventory products
    private HashMap<String, Integer> inventory;

    /**
     * Constructor to create a new inventory management system
     */
    public InventoryManagement() {
        inventory = new HashMap<>();
    }

    /**
     * Method to adds a product to the inventory or updates its quantity if it is already registered
     * @param productName The name of the product to add
     * @param quantity The quantity to add or update
     */
    public void addProduct(String productName, int quantity){
        if (inventory.containsKey(productName)){
            int currentQuantity = inventory.get(productName);
            inventory.put(productName, currentQuantity + quantity);
        }
        else {
            inventory.put(productName, quantity);
        }
    }

    /**
     * Method to remove a product from the inventory
     * @param productName The name of the product to remove
     */
    public void removeProduct(String productName){
        inventory.remove(productName);
    }

    /**
     * Method to update the quantity of a product
     * @param productName The name of the product to modify
     * @param newQuantity The new Quantity of the product
     */
    public void updateQuantity(String productName, Integer newQuantity){
        inventory.put(productName,newQuantity);
    }

    /**
     * Method to display the current inventory sorted by product name
     */
    public void displayInventory(){
        Map<String, Integer> sortedInventory = new TreeMap<>(inventory);
        System.out.println("Current Inventory:");
        for (Map.Entry<String, Integer> entry : sortedInventory.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    /**
     * (Bonus) Method to display the products that are low in stock (quantity < 5) to alert the inventory manager
     */
    public void alertLowStockProducts(){
        System.out.println("Low Stock Products (Quantity <5):");
        for(Map.Entry<String, Integer> entry : inventory.entrySet()){
            if(entry.getValue() < 5){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
