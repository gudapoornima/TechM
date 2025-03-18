package com.example.project2.Controllers;

import com.example.project2.dto.LoginRequest;
import com.example.project2.Repositories.Customerrepo;
import com.example.project2.Repositories.DriverRepo;
import com.example.project2.entities.Customer;
import com.example.project2.entities.Drivers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "http://localhost:4200") // Allow Angular requests
public class AuthController {

    private static final Logger logger = Logger.getLogger(AuthController.class.getName());

    @Autowired
    private Customerrepo customerRepo;

    @Autowired
    private DriverRepo driverRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest loginRequest) {
        logger.info("🔹 Login attempt for email: " + loginRequest.getEmail());

        try {
            // ✅ Admin Login Check
            if ("admin@example.com".equals(loginRequest.getEmail()) && "admin123".equals(loginRequest.getPassword())) {
                logger.info("✅ Admin login successful");
                return ResponseEntity.ok().body(new UserResponse(0L, "ADMIN"));
            }

            // ✅ Customer Login Check
            Optional<Customer> customerOpt = customerRepo.findByEmail(loginRequest.getEmail());
            if (customerOpt.isPresent() && passwordEncoder.matches(loginRequest.getPassword(), customerOpt.get().getPassword())) {
                Customer customer = customerOpt.get();
                logger.info("✅ Customer login successful: " + customer.getCustomerId());
                // Send the customerId in the response
                return ResponseEntity.ok().body(new UserResponse(customer.getCustomerId(), "CUSTOMER"));
            }

            // ✅ Driver Login Check
            Optional<Drivers> driverOpt = driverRepo.findByEmail(loginRequest.getEmail());
            if (driverOpt.isPresent()) {
                Drivers driver = driverOpt.get();

                if (!driver.isApproved()) {
                    logger.warning("⚠️ Driver login failed: Account not approved");
                    return ResponseEntity.badRequest().body("Your account is pending approval.");
                }

                if (passwordEncoder.matches(loginRequest.getPassword(), driver.getPassword())) {
                    logger.info("✅ Driver login successful: " + driver.getDriverId());
                    // Send the driverId in the response
                    return ResponseEntity.ok().body(new UserResponse(driver.getDriverId(), "DRIVER"));
                }
            }

            logger.warning("❌ Invalid login attempt for email: " + loginRequest.getEmail());
            return ResponseEntity.badRequest().body("Invalid email or password");
        } catch (Exception e) {
            logger.severe("❌ Error during login: " + e.getMessage());
            return ResponseEntity.internalServerError().body("An error occurred while processing login");
        }
    }

    // Response model to match frontend expectations
    public static class UserResponse {
        private Long id;
        private String role;

        // Constructor
        public UserResponse(Long id, String role) {
            this.id = id;
            this.role = role;
        }

        // Getters
        public Long getId() { return id; }
        public String getRole() { return role; }

        // Setters (optional, if needed)
        public void setId(Long id) { this.id = id; }
        public void setRole(String role) { this.role = role; }
    }
}
