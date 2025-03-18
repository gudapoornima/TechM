package com.app.model;

import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Integer empId;

    @Column(name = "emp_name", length = 20)
    private String empName;

    @Column(name = "emp_sal")
    private Integer empSal;

    // ✅ Default constructor (REQUIRED for JPA)
    public Employee() {}

    // ✅ Constructor with parameters
    public Employee(Integer empId,String empName, Integer empSal) {
    	this.empId=empId;
        this.empName = empName;
        this.empSal = empSal;
    }

    // ✅ Getters and Setters
    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpSal() {
        return empSal;
    }

    public void setEmpSal(Integer empSal) {
        this.empSal = empSal;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
    }
}
