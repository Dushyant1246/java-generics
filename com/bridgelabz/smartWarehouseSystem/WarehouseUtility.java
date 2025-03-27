package com.bridgelabz.smartWarehouseSystem;

import java.util.List;

public class WarehouseUtility {
    public static void displayItems(List<? extends WarehouseItem> items){
        for (WarehouseItem item : items){
            item.displayItemDetails();
            System.out.println("----------------");
        }
    }
}
