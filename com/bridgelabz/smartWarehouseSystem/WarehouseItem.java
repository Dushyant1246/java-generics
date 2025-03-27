package com.bridgelabz.smartWarehouseSystem;

abstract public class WarehouseItem {
    private int itemId;
    private String itemName;

    WarehouseItem(int itemId, String itemName){
        this.itemName = itemName;
        this.itemId = itemId;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    abstract public void displayItemDetails();
}
