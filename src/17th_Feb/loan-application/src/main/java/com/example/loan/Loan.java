package com.example.loan;

public interface Loan {
    double getAmount();
    void setAmount(double amount);

    double getInterestRate();
    void setInterestRate(double interestRate);

    int getTenure();
    void setTenure(int tenure);
}
