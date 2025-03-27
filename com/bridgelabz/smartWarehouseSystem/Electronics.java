package com.bridgelabz.smartWarehouseSystem;

public class Electronics extends WarehouseItem{

    Electronics(int itemId, String itemName) {
        super(itemId, itemName);
    }

    @Override
    public void displayItemDetails() {
        System.out.println(
                "Electronic Item:\n" +
                "Item ID: " + getItemId() + '\n' +
                "Item Name: " + getItemName()
        );
    }
}
