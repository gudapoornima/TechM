package com.test;
import com.test.Employee;
import com.test.EmployeeRepo;
import com.test.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.*;

@SuppressWarnings("unused")
@Service
@RequiredArgsConstructor
public class EmployeeServiceImplement implements EmployeeService {

    private final EmployeeRepo empRepo;

    @Override
    public Employee saveEmployee(Employee employee) {
        return empRepo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return empRepo.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return empRepo.findById(id).orElseThrow();
    }

    @Override
    public Employee updateEmployee(Long id, Employee updatedEmployee) {
        Employee emp = getEmployeeById(id);
        emp.setName(updatedEmployee.getName());
        emp.setEmail(updatedEmployee.getEmail());
        emp.setSalary(updatedEmployee.getSalary());
        emp.setDept(updatedEmployee.getDept());
        return empRepo.save(emp);
    }

    @Override
    public void deleteEmployee(Long id) {
        empRepo.deleteById(id);
    }
}