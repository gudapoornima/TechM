package com.test.service;

import com.test.entity.Cart;
//import com.test.entity.OrderItem;

import java.util.List;
import java.util.Optional;

public interface CartService {
    Cart saveCart(Cart cart);
    List<Cart> getAllCarts();
    Optional<Cart> getCartById(Long id); 
    void deleteCart(Long id);
}