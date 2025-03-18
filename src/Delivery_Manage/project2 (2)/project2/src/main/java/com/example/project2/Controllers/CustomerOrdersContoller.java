package com.example.project2.Controllers;

import com.example.project2.entities.*;
import com.example.project2.Repositories.OrderRepository;
import com.example.project2.Repositories.Customerrepo;
import com.example.project2.services.OrderAssignmentService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "http://localhost:4200")  
@Validated  
public class CustomerOrdersContoller {

    private final OrderRepository orderRepository;
    private final Customerrepo customerRepository;
    private final OrderAssignmentService orderAssignmentService; // ✅ Inject Service Layer

    // Inject dependencies via constructor
    public CustomerOrdersContoller(OrderRepository orderRepository, Customerrepo customerRepository, OrderAssignmentService orderAssignmentService) {
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
        this.orderAssignmentService = orderAssignmentService;
    }

    // ✅ Existing Create Order Method - Do NOT Modify
    @PostMapping
    public ResponseEntity<?> createOrder(@Valid @RequestBody Ordercust order) {
        if (order.getCustomer() == null || order.getCustomer().getEmail() == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Customer email is required.");
        }

        String email = order.getCustomer().getEmail();
        System.out.println("Customer Email from Request: " + email); // Debugging log

        // Fetch customer by email
        Optional<Customer> optionalCustomer = customerRepository.findByEmail(email);
        if (optionalCustomer.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Customer with email " + email + " not found.");
        }

        // Set customer in order and save
        Customer customer = optionalCustomer.get();
        order.setCustomer(customer);
        order.setStatus(Ordercust.Status.PENDING);

        Ordercust savedOrder = orderRepository.save(order);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedOrder);
    }

    @PostMapping("/{orderId}/assign")
    public ResponseEntity<?> assignOrderToDriver(@PathVariable Long orderId) {
        Optional<Drivers> assignedDriver = orderAssignmentService.assignOrder(orderId);

        if (assignedDriver.isPresent()) {
            Optional<Ordercust> order = orderRepository.findById(orderId); // Fetch the updated order
            if (order.isPresent()) {
                return ResponseEntity.ok().body(order.get());  // Return the complete order with the assigned driver
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Order not found.");
            }
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No available drivers or order not found.");
        }
    }
    @GetMapping("/driver/{driverId}/assigned-orders")
    public ResponseEntity<?> getAssignedOrdersForDriver(@PathVariable Long driverId) {
        List<Ordercust> assignedOrders = orderRepository.findByDriver_Id(driverId);
        
        if (assignedOrders.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No assigned orders for this driver.");
        }
        
        return ResponseEntity.ok().body(assignedOrders);
    }


}
