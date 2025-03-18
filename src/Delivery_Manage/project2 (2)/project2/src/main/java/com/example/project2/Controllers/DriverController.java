package com.example.project2.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.project2.Repositories.DriverRepo;
import com.example.project2.entities.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/drivers")
@CrossOrigin(origins = "http://localhost:4200") // Allow frontend requests
public class DriverController {

    @Autowired
    private DriverRepo driverRepo;

    // Get all pending drivers
    @GetMapping("/pending")
    public ResponseEntity<List<Drivers>> getPendingDrivers() {
        List<Drivers> pendingDrivers = driverRepo.findByApprovedFalse();  // Custom query to get pending drivers
        return ResponseEntity.ok(pendingDrivers);
    }

    // Register a driver
    @PostMapping("/register")
    public ResponseEntity<ApiResponse> registerDriver(@RequestBody Drivers driver) {
        if (driver == null) {
            return ResponseEntity.badRequest().body(new ApiResponse("Driver data is missing"));
        }
        
        // Automatically set role and approval status
        driver.setRole(Role.DRIVER);  
        driver.setApproved(false);     // By default, set driver as not approved
        driver.setAvailable(false);    // By default, set driver as not available
        
        // Save to DB
        driverRepo.save(driver);      

        // Return a JSON response
        return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse("Driver registered successfully"));
    }

    // Get all drivers
    @GetMapping("/all")
    public ResponseEntity<List<Drivers>> getAllDrivers() {
        List<Drivers> drivers = driverRepo.findAll();
        return ResponseEntity.ok(drivers);
    }

    // Approve a driver
    @PutMapping("/approve/{driverId}")
    public ResponseEntity<ApiResponse> approveDriver(@PathVariable Long driverId) {
        Optional<Drivers> driverOpt = driverRepo.findById(driverId);
        if (driverOpt.isPresent()) {
            Drivers driver = driverOpt.get();
            driver.setApproved(true);  // Set approval to true
            driverRepo.save(driver);  // Save the updated driver details
            return ResponseEntity.ok(new ApiResponse("Driver approved successfully"));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse("Driver not found"));
    }

    // Reject a driver
    @PutMapping("/reject/{driverId}")
    public ResponseEntity<ApiResponse> rejectDriver(@PathVariable Long driverId) {
        Optional<Drivers> driverOpt = driverRepo.findById(driverId);
        if (driverOpt.isPresent()) {
            Drivers driver = driverOpt.get();
            driver.setApproved(false);  // Set approval to false (reject)
            driverRepo.save(driver);  // Save the updated driver details
            return ResponseEntity.ok(new ApiResponse("Driver rejected successfully"));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ApiResponse("Driver not found"));
    }
    @PutMapping("/{driverId}/availability")
    public ResponseEntity<String> updateDriverAvailability(@PathVariable Long driverId, @RequestBody boolean availability) {
        Optional<Drivers> driverOpt = driverRepo.findById(driverId);
        
        if (driverOpt.isPresent()) {
            Drivers driver = driverOpt.get();
            driver.setAvailable(availability);
            driverRepo.save(driver);
            return ResponseEntity.ok("Availability updated successfully.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Driver not found.");
        }
    }


    // Helper class to return the JSON response
    public static class ApiResponse {
        private String message;

        public ApiResponse(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
