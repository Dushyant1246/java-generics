package com.bridgelabz.smartWarehouseSystem;

public class WarehouseSystem {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics(101, "Laptop"));
        electronicsStorage.addItem(new Electronics(102, "Smartphone"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries(201, "Apple"));
        groceriesStorage.addItem(new Groceries(202, "Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture(301, "Table"));
        furnitureStorage.addItem(new Furniture(302, "Chair"));

        // Display items using the wildcard method
        System.out.println("Electronics Storage:");
        WarehouseUtility.displayItems(electronicsStorage.getItems());

        System.out.println("\nGroceries Storage:");
        WarehouseUtility.displayItems(groceriesStorage.getItems());

        System.out.println("\nFurniture Storage:");
        WarehouseUtility.displayItems(furnitureStorage.getItems());
    }
}
/*
Electronics Storage:
Electronic Item:
Item ID: 101
Item Name: Laptop
----------------
Electronic Item:
Item ID: 102
Item Name: Smartphone
----------------

Groceries Storage:
Groceries Item:
Item ID: 201
Item Name: Apple
----------------
Groceries Item:
Item ID: 202
Item Name: Milk
----------------

Furniture Storage:
Furniture Item:
Item ID: 301
Item Name: Table
----------------
Furniture Item:
Item ID: 302
Item Name: Chair
----------------
 */