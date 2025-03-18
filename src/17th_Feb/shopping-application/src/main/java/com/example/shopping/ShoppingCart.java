package com.example.shopping;

public class ShoppingCart {
    private DiscountService discountService;

    // Interface Injection through setter method
    public void setDiscountService(DiscountService discountService) {
        this.discountService = discountService;
    }

    public double calculateTotalPrice(Product product) {
        double totalPrice = product.getPrice();
        if (discountService != null) {
            totalPrice = discountService.applyDiscount(totalPrice);
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "ShoppingCart [discountService=" + discountService + "]";
    }
}
