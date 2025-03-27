package com.bridgelabz.smartWarehouseSystem;

public class Groceries extends WarehouseItem{
    Groceries(int itemId, String itemName) {
        super(itemId, itemName);
    }

    @Override
    public void displayItemDetails() {
        System.out.println(
                "Groceries Item:\n" +
                "Item ID: " + getItemId() + '\n' +
                "Item Name: " + getItemName()
        );
    }
}
