package com.example.project2.Controllers;

import com.example.project2.Repositories.*;
import com.example.project2.entities.Ordercust;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/orders")
@CrossOrigin(origins = "http://localhost:4200") // Allow Angular requests
public class OrderController {

    @Autowired
    private OrderRepository orderRepo;

    @GetMapping("/customer/{customerId}")
    public Optional<Ordercust> getOrdersByCustomer(@PathVariable Long customerId) {
        // Fetch orders based on customer ID
        return orderRepo.findById(customerId);
    }
}
