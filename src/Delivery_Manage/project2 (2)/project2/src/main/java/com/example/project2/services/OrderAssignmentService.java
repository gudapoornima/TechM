package com.example.project2.services;

import com.example.project2.entities.*;
import com.example.project2.Repositories.DriverRepo;
import com.example.project2.Repositories.OrderRepository;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class OrderAssignmentService {

    private final DriverRepo driverRepository;
    private final OrderRepository orderRepository;

    public OrderAssignmentService(DriverRepo driverRepository, OrderRepository orderRepository) {
        this.driverRepository = driverRepository;
        this.orderRepository = orderRepository;
    }

    public Optional<Drivers> assignOrder(Long orderId) {
        Optional<Ordercust> optionalOrder = orderRepository.findById(orderId);
        if (optionalOrder.isEmpty()) {
            return Optional.empty();
        }

        // Get available and approved drivers
        List<Drivers> availableDrivers = driverRepository.findApprovedAndAvailableDrivers();
        if (availableDrivers.isEmpty()) {
            return Optional.empty();
        }

        // Assign the first available driver
        Drivers assignedDriver = availableDrivers.get(0);
        Ordercust order = optionalOrder.get();
        order.setDriver(assignedDriver);
        order.setStatus(Ordercust.Status.ASSIGNED);
        orderRepository.save(order);

        return Optional.of(assignedDriver);
    }
}
