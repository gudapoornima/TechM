package com.example.project2.Repositories;


import com.example.project2.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public interface OrderRepository extends JpaRepository<Ordercust, Long> {
	 List<Ordercust> findByStatus(Ordercust.Status status);

	 List<Ordercust> findByDriver_Id(Long driverId);
}
