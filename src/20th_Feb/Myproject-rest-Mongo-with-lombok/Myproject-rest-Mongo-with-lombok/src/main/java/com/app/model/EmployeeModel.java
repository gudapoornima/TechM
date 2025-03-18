package com.app.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Document(collection = "employees")
@Data                   // Generates getters, setters, toString, equals, and hashCode
@NoArgsConstructor      // No-args constructor
@AllArgsConstructor     // All-args constructor
public class EmployeeModel {
    
    public static final String SEQUENCE_NAME = "employees_sequence"; 
    
    @Id
    private Long id;
    private String name;
    private String gender;
    private String dob;
    private String country;
}
