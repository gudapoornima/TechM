package com.app.service;

import com.app.model.Employee;
import com.app.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Get all employees
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Get employee by ID
    public Optional<Employee> getEmployeeById(Integer empId) {
        return employeeRepository.findById(empId);
    }

    // Create new employee
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Update existing employee
    public Employee updateEmployee(Integer empId, Employee employeeDetails) {
        return employeeRepository.findById(empId)
                .map(employee -> {
                    employee.setEmpName(employeeDetails.getEmpName());
                    employee.setEmpSal(employeeDetails.getEmpSal());
                    return employeeRepository.save(employee);
                })
                .orElseThrow(() -> new RuntimeException("Employee not found with id " + empId));
    }

    // Delete employee by ID
    public void deleteEmployee(Integer empId) {
        employeeRepository.deleteById(empId);
    }
}
