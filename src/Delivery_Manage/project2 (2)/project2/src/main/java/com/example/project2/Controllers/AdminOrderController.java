package com.example.project2.Controllers;

import com.example.project2.entities.Ordercust;
import com.example.project2.Repositories.OrderRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/admin/orders")  
@CrossOrigin(origins = "http://localhost:4200") // Enable CORS for Angular
public class AdminOrderController {

    private final OrderRepository orderRepository;

    public AdminOrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    // Fetch only pending orders
    @GetMapping("/pending")
    public List<Ordercust> getPendingOrders() {
        return orderRepository.findByStatus(Ordercust.Status.PENDING);
    }

    // Update order status to "ASSIGNED"
    @PatchMapping("/{id}/status")
    @Transactional  
    public ResponseEntity<?> updateOrderStatus(@PathVariable Long id, @RequestBody Map<String, String> request) {
        if (!request.containsKey("status")) {
            return ResponseEntity.badRequest().body("Missing 'status' field in request body.");
        }

        String status = request.get("status");

        return orderRepository.findById(id).map(order -> {
            try {
                Ordercust.Status newStatus = Ordercust.Status.valueOf(status.toUpperCase());
                if (newStatus == Ordercust.Status.ASSIGNED) {
                    order.setStatus(newStatus);
                    orderRepository.save(order);
                    return ResponseEntity.ok(order);
                } else {
                    return ResponseEntity.badRequest().body("Invalid status. Allowed: ASSIGNED.");
                }
            } catch (IllegalArgumentException e) {
                return ResponseEntity.badRequest().body("Invalid status provided.");
            }
        }).orElse(ResponseEntity.notFound().build());
    }
}
