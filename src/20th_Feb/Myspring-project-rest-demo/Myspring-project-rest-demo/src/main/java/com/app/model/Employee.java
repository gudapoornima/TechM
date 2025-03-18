package com.app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                  // Generates getters, setters, toString, equals, and hashCode
@NoArgsConstructor     // Generates a no-args constructor
@AllArgsConstructor    // Generates an all-args constructor
@XmlRootElement        // For XML binding
public class Employee {
    
    private Integer empId;
    private String empName;
    private double empSal;
}
