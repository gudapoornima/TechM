package com.example.inventory;

public class Item {
    private String name;
    private int quantity;
    private double price;

    // Constructor Injection
    public Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item [name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
    }
}
