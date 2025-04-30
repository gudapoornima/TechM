package com.test.service.impl;

import com.test.entity.*;
import com.test.repository.*;
import com.test.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService {
    private final CartRepo cartRepo;

    @Override
    public Cart saveCart(Cart cart) {
        return cartRepo.save(cart);
    }

    @Override
    public List<Cart> getAllCarts() {
        return cartRepo.findAll();
    }

    @Override
    public Optional<Cart> getCartById(Long id) {
        return cartRepo.findById(id);
    }

    @Override
    public void deleteCart(Long id) {
        cartRepo.deleteById(id);
    }
}