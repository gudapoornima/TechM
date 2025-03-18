package com.example.project2.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import java.util.List;

@Entity
public class Drivers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank(message = "First name is required")
    @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters")
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email format")
    @Column(unique = true)  // Ensures unique email in DB
    private String email;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone number must be exactly 10 digits")
    @Column(unique = true)  // Ensures unique phone number in DB
    private String phone;

    @NotBlank(message = "License number is required")
    @Size(min = 6, max = 15, message = "License number must be between 6 and 15 characters")
    @Column(unique = true)  // Ensures unique license number in DB
    private String licenseNumber;

    @NotBlank(message = "Vehicle number is required")
    @Size(min = 6, max = 15, message = "Vehicle number must be between 6 and 15 characters")
    private String vehicleNumber;

    @NotBlank(message = "Vehicle type is required")
    private String vehicleType;

    @NotBlank(message = "Password is required")
    @Size(min = 8, message = "Password must be at least 8 characters long")
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role = Role.DRIVER;  // Default role

    private boolean approved = false;  // Default: Pending approval

    private boolean available = true;  // Default: Driver is available

    @NotBlank(message = "Street is required")
    private String street;

    @NotBlank(message = "City is required")
    private String city;

    @NotBlank(message = "State is required")
    private String state;

    @NotBlank(message = "Country is required")
    private String country;

    @NotBlank(message = "Pincode is required")
    @Pattern(regexp = "^[0-9]{6}$", message = "Pincode must be exactly 6 digits")
    private String pincode;

    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ordercust> orders;

    // New field to store the license photo URL/path
    private String licensePhotoPath;  // Store the path or URL to the license photo

    // Default constructor
    public Drivers() {}

    // Constructor with all required fields
    public Drivers(String firstName, String lastName, String email, String phone, 
                   String licenseNumber, String vehicleNumber, String vehicleType, 
                   String password, String street, String city, String state, 
                   String country, String pincode, String licensePhotoPath) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.licenseNumber = licenseNumber;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.setPassword(password);  // Hashing password before setting
        this.role = Role.DRIVER;
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
        this.licensePhotoPath = licensePhotoPath;  // Set license photo path
    }

    // Getters and Setters
    public Long getDriverId() { return id; }
    public void setDriverId(Long driverId) { this.id = driverId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }

    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }

    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String vehicleType) { this.vehicleType = vehicleType; }

    public String getPassword() { return password; }
    public void setPassword(String password) {
        this.password = new BCryptPasswordEncoder().encode(password); // Hashing password before setting it
    }

    public Role getRole() { return role; }
    public void setRole(Role role) { this.role = role; }

    public boolean isApproved() { return approved; }
    public void setApproved(boolean approved) { this.approved = approved; }

    public boolean isAvailable() { return available; }
    public void setAvailable(boolean available) { this.available = available; }

    public String getStreet() { return street; }
    public void setStreet(String street) { this.street = street; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getState() { return state; }
    public void setState(String state) { this.state = state; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getPincode() { return pincode; }
    public void setPincode(String pincode) { this.pincode = pincode; }

    public List<Ordercust> getOrders() { return orders; }
    public void setOrders(List<Ordercust> orders) { this.orders = orders; }

    // Getter and setter for license photo path
    public String getLicensePhotoPath() { return licensePhotoPath; }
    public void setLicensePhotoPath(String licensePhotoPath) { this.licensePhotoPath = licensePhotoPath; }
}
