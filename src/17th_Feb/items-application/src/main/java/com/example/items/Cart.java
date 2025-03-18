package com.example.items;

import java.util.List;

public class Cart {
    private List<Item> items;

    // Getter and Setter for items
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    // Method to calculate total cost
    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Cart [items=" + items + "]";
    }
}
