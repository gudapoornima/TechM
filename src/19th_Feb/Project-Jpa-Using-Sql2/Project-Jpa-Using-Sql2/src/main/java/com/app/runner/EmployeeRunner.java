package com.app.runner;

import com.app.model.Employee;
import com.app.repo.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Component
public class EmployeeRunner implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;

    public EmployeeRunner(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\n=== Employee Management System ===");
            System.out.println("1. Insert Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    insertEmployee(scanner);
                    break;
                case 2:
                    updateEmployee(scanner);
                    break;
                case 3:
                    deleteEmployee(scanner);
                    break;
                case 4:
                    displayAllEmployees();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1-5.");
            }
        }
        scanner.close();
    }

    private void insertEmployee(Scanner scanner) {
        System.out.print("Enter Employee Id: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (employeeRepository.existsById(empId)) {
            System.out.println("Employee with ID " + empId + " already exists.");
            return;
        }

        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Enter Employee Salary: ");
        int empSal = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Employee employee = new Employee(empId, empName, empSal);
        employeeRepository.save(employee);
        System.out.println("Employee inserted successfully: " + employee);
    }



    private void updateEmployee(Scanner scanner) {
        System.out.print("Enter Employee ID to update: ");
        Integer empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Optional<Employee> optionalEmployee = employeeRepository.findById(empId);
        if (optionalEmployee.isPresent()) {
            Employee employee = optionalEmployee.get();
            System.out.print("Enter new name (current: " + employee.getEmpName() + "): ");
            String newName = scanner.nextLine();
            System.out.print("Enter new salary (current: " + employee.getEmpSal() + "): ");
            int newSalary = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            employee.setEmpName(newName);
            employee.setEmpSal(newSalary);
            employeeRepository.save(employee);
            System.out.println("Employee updated successfully: " + employee);
        } else {
            System.out.println("Employee with ID " + empId + " not found.");
        }
    }

    private void deleteEmployee(Scanner scanner) {
        System.out.print("Enter Employee ID to delete: ");
        Integer empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (employeeRepository.existsById(empId)) {
            employeeRepository.deleteById(empId);
            System.out.println("Employee with ID " + empId + " deleted successfully.");
        } else {
            System.out.println("Employee with ID " + empId + " not found.");
        }
    }

    private void displayAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            System.out.println("\n=== Employee List ===");
            employees.forEach(System.out::println);
        }
    }
}
