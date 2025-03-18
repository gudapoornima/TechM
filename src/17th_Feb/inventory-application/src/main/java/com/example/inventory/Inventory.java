package com.example.inventory;

import java.util.List;

public class Inventory {
    private List<Item> items;

    // Constructor Injection of the List of Items
    public Inventory(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Inventory [items=" + items + "]";
    }
}
