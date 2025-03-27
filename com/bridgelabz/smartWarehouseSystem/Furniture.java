package com.bridgelabz.smartWarehouseSystem;

public class Furniture extends WarehouseItem{
    Furniture(int itemId, String itemName) {
        super(itemId, itemName);
    }

    @Override
    public void displayItemDetails() {
        System.out.println(
                "Furniture Item:\n" +
                "Item ID: " + getItemId() + '\n' +
                "Item Name: " + getItemName()
        );
    }
}
