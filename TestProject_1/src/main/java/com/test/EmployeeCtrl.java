package com.test;
import com.test.Employee;
import com.test.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.*;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeCtrl {

    private final EmployeeService empService;

    @PostMapping
    public ResponseEntity<Employee> create(@RequestBody @Valid Employee employee) {
        return ResponseEntity.ok(empService.saveEmployee(employee));
    }

    @GetMapping
    public List<Employee> getAll() {
        return empService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getById(@PathVariable Long id) {
        return empService.getEmployeeById(id);
    }

    @PutMapping("/{id}")
    public Employee update(@PathVariable Long id, @RequestBody Employee employee) {
        return empService.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        empService.deleteEmployee(id);
    }
}