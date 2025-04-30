package com.test.service;

import com.test.entity.CartItem;
//import com.test.entity.OrderItem;

import java.util.List;
import java.util.Optional;

public interface CartItemService {
    CartItem saveCartItem(CartItem cartItem);
    List<CartItem> getAllCartItems();
    Optional<CartItem> getCartItemById(Long id);
    void deleteCartItem(Long id);
}