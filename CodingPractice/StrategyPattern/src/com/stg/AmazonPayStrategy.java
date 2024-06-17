package com.stg;

public class AmazonPayStrategy implements PaymentStrategy {
    private String amazonEmail;
    private String password;
    
    public AmazonPayStrategy(String amazonEmail, String password) {
        this.amazonEmail = amazonEmail;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        if (isValidAmazonEmail(amazonEmail)) {
            System.out.println(amount + " paid using Amazon Pay.");
        } else {
            System.out.println("Invalid Amazon Pay email.");
        }
    }

    private boolean isValidAmazonEmail(String email) {
        // Simple regex for email validation
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        return email.matches(emailRegex);
    }
}
