package com.test.service.impl;

import com.test.entity.*;
import com.test.repository.*;
import com.test.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepo orderRepo;
    private final OrderItemRepo orderItemRepo;

    @Override
    public Order saveOrder(Order order) {
    	for (OrderItem item : order.getItems()) {
            item.setOrder(order); // Make sure the Order is set for each OrderItem
        }
        return orderRepo.save(order);
    }


    @Override
    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }

    @Override
    public Optional<Order> getOrderById(Long id) {
        return orderRepo.findById(id);
    }

    @Override
    public void deleteOrder(Long id) {
        orderRepo.deleteById(id);
    }
}

