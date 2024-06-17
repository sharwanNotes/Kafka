package com.stg;

public class CreditCardStrategy implements PaymentStrategy {
	private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;
    
    public CreditCardStrategy(String name, String cardNumber, String cvv, String dateOfExpiry) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }
	@Override
	public void pay(int amount) {
		 if (isValidCard()) {
	            System.out.println(amount + " paid with credit/debit card");
	        } else {
	            System.out.println("Invalid credit card details.");
	        }
		
	}
	private boolean isValidCard() {
		return true;
	}

}
