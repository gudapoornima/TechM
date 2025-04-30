package com.test.service;

import com.test.entity.Order;
//import com.test.entity.OrderItem;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    Order saveOrder(Order order);
    List<Order> getAllOrders();
    Optional<Order> getOrderById(Long id); 
    void deleteOrder(Long id);
}

