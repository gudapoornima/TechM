package com.example.bean;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                   // Generates getters, setters, toString, equals, hashCode
@NoArgsConstructor      // Generates default constructor
@AllArgsConstructor     // Generates constructor with all fields
public class Cake {

    @NotNull(message = "Must select one option")
    private Integer selectedcake;

    private String flavor;
    private Integer flavorRate;
    private Integer includeCandles;
    private Integer includeinscription;
    private String theinscription;

    @NotEmpty(message = "Name is required")
    private String name;

    @NotEmpty(message = "Address is required")
    private String address;

    @NotEmpty(message = "Phone number is required")
    @Pattern(regexp = "^[\\d]{10}$", message = "Phone number should be 10 digits")
    private String phonenumber;

    private double price;
}
