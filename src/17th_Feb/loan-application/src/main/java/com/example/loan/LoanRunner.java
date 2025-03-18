package com.example.loan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LoanRunner {
    public static void main(String[] args) {
        // Load the Spring context (bean configuration)
        ApplicationContext context = new ClassPathXmlApplicationContext("LoanConfig.xml");

        // Get the LoanService bean and print its details
        LoanService loanService = (LoanService) context.getBean("loanService");
        System.out.println(loanService);  // Should print Loan Type=HousingLoan or VehicleLoan (depending on the bean you inject)
    }
}
