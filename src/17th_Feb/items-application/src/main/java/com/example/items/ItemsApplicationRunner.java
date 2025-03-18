package com.example.items;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsApplicationRunner {
    public static void main(String[] args) {
        // Load Spring context from XML configuration
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("items-config.xml");

        // Retrieve Cart bean and print the total
        Cart cart = (Cart) context.getBean("cart");
        System.out.println("Cart contents: " + cart);
        System.out.println("Total price: " + cart.calculateTotal());
    }
}
