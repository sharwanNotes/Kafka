package com.stg;

public class PaypalStrategy implements PaymentStrategy {
    private String emailId;
    private String password;
    
    public PaypalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        if (isValidEmail(emailId)) {
            System.out.println(amount + " paid using PayPal.");
        } else {
            System.out.println("Invalid PayPal email.");
        }
    }

    private boolean isValidEmail(String email) {
        // Simple regex for email validation
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email.matches(emailRegex);
    }
}