package com.test;

import com.test.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

@SuppressWarnings("unused")
public interface EmployeeRepo extends JpaRepository<Employee, Long> {}