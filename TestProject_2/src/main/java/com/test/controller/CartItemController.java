package com.test.controller;

import com.test.entity.*;
import com.test.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cart-items")
@RequiredArgsConstructor
public class CartItemController {
    private final CartItemService cartItemService;

    @PostMapping
    public ResponseEntity<CartItem> create(@RequestBody CartItem cartItem) {
        return ResponseEntity.ok(cartItemService.saveCartItem(cartItem));
    }

    @GetMapping
    public List<CartItem> getAll() {
        return cartItemService.getAllCartItems();
    }

    @GetMapping("/{id}")
    public Optional<CartItem> getById(@PathVariable Long id) {
        return cartItemService.getCartItemById(id);
    }

    /*
    @PutMapping("/{id}")
    public CartItem update(@PathVariable Long id, @RequestBody CartItem cartItem) {
        return cartItemService.updateCartItem(id, cartItem);
    }
    */

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        cartItemService.deleteCartItem(id);
    }
}
