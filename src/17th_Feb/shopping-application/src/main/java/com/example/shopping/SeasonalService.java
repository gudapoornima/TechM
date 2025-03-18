package com.example.shopping;

public class SeasonalService implements DiscountService {
    @Override
    public double applyDiscount(double totalPrice) {
        // Apply a 10% discount
        return totalPrice * 0.90;
    }
}
