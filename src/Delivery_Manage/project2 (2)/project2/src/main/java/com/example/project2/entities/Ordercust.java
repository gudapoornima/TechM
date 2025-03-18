package com.example.project2.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "orders")
public class Ordercust {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;

    @ManyToOne(cascade = CascadeType.MERGE) // Merging customer details without creating new ones
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    @ManyToOne // No cascading to prevent unintentional driver creation
    @JoinColumn(name = "driver_id")
    private Drivers driver;

    // Pickup Address Fields
    @NotBlank(message = "Pickup street is required")
    private String pickupStreet;

    @NotBlank(message = "Pickup city is required")
    private String pickupCity;

    @NotBlank(message = "Pickup state is required")
    private String pickupState;

    @NotBlank(message = "Pickup country is required")
    private String pickupCountry;

    @NotBlank(message = "Pickup pincode is required")
    private String pickupPincode;

    // Destination Address Fields
    @NotBlank(message = "Destination street is required")
    private String destinationStreet;

    @NotBlank(message = "Destination city is required")
    private String destinationCity;

    @NotBlank(message = "Destination state is required")
    private String destinationState;

    @NotBlank(message = "Destination country is required")
    private String destinationCountry;

    @NotBlank(message = "Destination pincode is required")
    private String destinationPincode;

    @NotBlank(message = "Item name is mandatory")
    @Column(nullable = false)
    private String itemName;

    @Positive(message = "Item weight must be positive")
    @Column(nullable = false)
    private double itemWeight;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @FutureOrPresent(message = "Pickup date cannot be in the past")
    @Column(nullable = false)
    private LocalDate pickupDate;

    @NotNull(message = "Start time is required")
    @Column(nullable = false)
    private LocalTime startTime;

    @NotNull(message = "End time is required")
    @Column(nullable = false)
    private LocalTime endTime;

    @Column(columnDefinition = "TEXT")
    private String instructions;

    public enum Status {
        PENDING, ASSIGNED, PICKED_UP, IN_TRANSIT, DELIVERED, CANCELLED
    }

    // Default Constructor
    public Ordercust() {
        this.status = Status.PENDING;
    }

    // Parameterized Constructor
    public Ordercust(Customer customer, String pickupStreet, String pickupCity, String pickupState,
                     String pickupCountry, String pickupPincode, String destinationStreet,
                     String destinationCity, String destinationState, String destinationCountry,
                     String destinationPincode, String itemName, double itemWeight, LocalDate pickupDate,
                     LocalTime startTime, LocalTime endTime, String instructions) {
        this.customer = customer;
        this.pickupStreet = pickupStreet;
        this.pickupCity = pickupCity;
        this.pickupState = pickupState;
        this.pickupCountry = pickupCountry;
        this.pickupPincode = pickupPincode;
        this.destinationStreet = destinationStreet;
        this.destinationCity = destinationCity;
        this.destinationState = destinationState;
        this.destinationCountry = destinationCountry;
        this.destinationPincode = destinationPincode;
        this.itemName = itemName;
        this.itemWeight = itemWeight;
        this.pickupDate = pickupDate;
        this.startTime = startTime;
        this.endTime = endTime;
        this.instructions = instructions;
        this.status = Status.PENDING;
    }

    // Getters and Setters
    public Long getOrderId() { return orderId; }
    public void setOrderId(Long orderId) { this.orderId = orderId; }

    public Customer getCustomer() { return customer; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    public Drivers getDriver() { return driver; }
    public void setDriver(Drivers driver) { this.driver = driver; }

    public String getPickupStreet() { return pickupStreet; }
    public void setPickupStreet(String pickupStreet) { this.pickupStreet = pickupStreet; }

    public String getPickupCity() { return pickupCity; }
    public void setPickupCity(String pickupCity) { this.pickupCity = pickupCity; }

    public String getPickupState() { return pickupState; }
    public void setPickupState(String pickupState) { this.pickupState = pickupState; }

    public String getPickupCountry() { return pickupCountry; }
    public void setPickupCountry(String pickupCountry) { this.pickupCountry = pickupCountry; }

    public String getPickupPincode() { return pickupPincode; }
    public void setPickupPincode(String pickupPincode) { this.pickupPincode = pickupPincode; }

    public String getDestinationStreet() { return destinationStreet; }
    public void setDestinationStreet(String destinationStreet) { this.destinationStreet = destinationStreet; }

    public String getDestinationCity() { return destinationCity; }
    public void setDestinationCity(String destinationCity) { this.destinationCity = destinationCity; }

    public String getDestinationState() { return destinationState; }
    public void setDestinationState(String destinationState) { this.destinationState = destinationState; }

    public String getDestinationCountry() { return destinationCountry; }
    public void setDestinationCountry(String destinationCountry) { this.destinationCountry = destinationCountry; }

    public String getDestinationPincode() { return destinationPincode; }
    public void setDestinationPincode(String destinationPincode) { this.destinationPincode = destinationPincode; }

    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }

    public double getItemWeight() { return itemWeight; }
    public void setItemWeight(double itemWeight) { this.itemWeight = itemWeight; }

    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }

    public LocalDate getPickupDate() { return pickupDate; }
    public void setPickupDate(LocalDate pickupDate) { this.pickupDate = pickupDate; }

    public LocalTime getStartTime() { return startTime; }
    public void setStartTime(LocalTime startTime) { this.startTime = startTime; }

    public LocalTime getEndTime() { return endTime; }
    public void setEndTime(LocalTime endTime) { this.endTime = endTime; }

    public String getInstructions() { return instructions; }
    public void setInstructions(String instructions) { this.instructions = instructions; }
}

