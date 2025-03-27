package com.bridgelabz.smartWarehouseSystem;

import java.util.ArrayList;
import java.util.List;

public class Storage<T extends WarehouseItem>{
    private List<T> warehouseItems = new ArrayList<>();

    public void addItem(T item){
        warehouseItems.add(item);
    }

    public List<T> getItems() {
        return warehouseItems;
    }
}
