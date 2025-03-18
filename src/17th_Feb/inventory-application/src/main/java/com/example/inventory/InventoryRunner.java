package com.example.inventory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InventoryRunner {
    public static void main(String[] args) {
        // Load the Spring context from XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("InventoryConfig.xml");

        // Get the Inventory bean and print its details
        Inventory inventory = (Inventory) context.getBean("inventory");
        System.out.println(inventory);
    }
}
