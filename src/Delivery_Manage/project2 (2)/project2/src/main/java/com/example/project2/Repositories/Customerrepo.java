package com.example.project2.Repositories;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.project2.entities.Customer;

@Repository
public interface Customerrepo extends JpaRepository<Customer, Long> {
	 Optional<Customer> findByEmail(String email);  
	 
}