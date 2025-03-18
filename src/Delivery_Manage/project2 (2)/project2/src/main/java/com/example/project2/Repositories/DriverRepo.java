package com.example.project2.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.project2.entities.Drivers;

@Repository
public interface DriverRepo extends JpaRepository<Drivers, Long> {
    
    Optional<Drivers> findByEmail(String email);
    
    List<Drivers> findByApprovedFalse();
    
    @Query("SELECT d FROM Drivers d WHERE d.approved = true AND d.available = true")
    List<Drivers> findApprovedAndAvailableDrivers();
}
