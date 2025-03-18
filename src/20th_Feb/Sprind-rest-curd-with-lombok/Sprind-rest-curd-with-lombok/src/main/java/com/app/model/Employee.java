package com.app.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee2")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empId")  // Match column name in the table
    private Integer empId;

    @Column(name = "empName", nullable = false)
    private String empName;

    @Column(name = "empSal", nullable = false)
    private double empSal;
}
