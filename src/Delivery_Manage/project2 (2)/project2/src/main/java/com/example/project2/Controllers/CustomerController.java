package com.example.project2.Controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project2.Repositories.*;
import com.example.project2.entities.Customer;
import com.example.project2.entities.Role;

@RestController
@RequestMapping("/api/customers")
@CrossOrigin(origins = "http://localhost:4200") // Allow Angular frontend requests
public class CustomerController {

    @Autowired
    private Customerrepo customerrepo;
    
    @PostMapping("/register")
    public ResponseEntity<?> registerCustomer(@RequestBody Customer customer) {
        try {
            // Set role to CUSTOMER before saving
            customer.setRole(Role.CUSTOMER);
            
            // Save the customer
            Customer savedCustomer = customerrepo.save(customer);
            
            // Return success response
            return ResponseEntity.ok(savedCustomer);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid request: " + e.getMessage());
        }
    }

    // Get all registered customers
    @GetMapping("/all")
    public List<Customer> getAllCustomers() {
        return customerrepo.findAll();
    }
}
