package com.example.shopping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OnlineShoppingRunner {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("shopping-config.xml");

        // Retrieve the shopping cart bean
        ShoppingCart shoppingCart = (ShoppingCart) context.getBean("shoppingCart");

        // Create a product
        Product product = new Product("Laptop", 1500.00);

        // Calculate the total price after discount
        double finalPrice = shoppingCart.calculateTotalPrice(product);
        System.out.println("Final Price after Discount: " + finalPrice);
    }
}
