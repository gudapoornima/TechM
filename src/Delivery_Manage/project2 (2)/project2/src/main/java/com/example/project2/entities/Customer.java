package com.example.project2.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long Id;

    @NotBlank(message = "Username is required")
    @Column(unique = true, nullable = false)
    private String username;

    @NotBlank(message = "First name is required")
    private String firstName;

    @NotBlank(message = "Last name is required")
    private String lastName;

    @Email(message = "Invalid email format")
    @Column(unique = true, nullable = false)
    private String email;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "\\d{10}", message = "Phone number must be 10 digits")
    private String phone;

    @NotBlank(message = "Password is required")
    private String password;

    @Enumerated(EnumType.STRING)  // Enum type to store the role as a string in the database
    private Role role = Role.CUSTOMER;  // Default role

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ordercust> orders;

    // Constructors
    public Customer() {}

    public Customer(String username, String firstName, String lastName, String email, String phone, String password) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.setPassword(password);  // Hashing password before storing
        this.role = Role.CUSTOMER;   // Default role is CUSTOMER
    }

    // Getters and Setters
    public Long getCustomerId() { return Id; }
    public void setCustomerId(Long customerId) { this.Id = customerId; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getPassword() { return password; }
    public void setPassword(String password) {
        this.password = new BCryptPasswordEncoder().encode(password); // Hash password before setting it
    }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }

    public List<Ordercust> getOrders() { return orders; }
    public void setOrders(List<Ordercust> orders) { this.orders = orders; }
}
