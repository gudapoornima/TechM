package com.example.loan;

public class LoanService {
    private Loan loanType;  // Loan can be either HousingLoan or VehicleLoan

    public Loan getLoanType() {
        return loanType;
    }

    public void setLoanType(Loan loanType) {
        this.loanType = loanType;
    }

    @Override
    public String toString() {
        return "LoanService [Loan Type=" + loanType.toString() + "]";
    }
}
