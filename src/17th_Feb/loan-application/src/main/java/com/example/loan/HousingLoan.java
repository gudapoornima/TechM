package com.example.loan;

public class HousingLoan implements Loan {
    private double amount;
    private double interestRate;
    private int tenure;

    // Getters and Setters
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    @Override
    public String toString() {
        return "HousingLoan [Amount=" + amount + ", Interest Rate=" + interestRate + "%, Tenure=" + tenure + " years]";
    }
}
