package com.stg;

public class ShoppingCartTest {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678", 40);
        Item item3 = new Item("5432", 50);
        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        // pay by PayPal
        cart.pay(new PaypalStrategy("myemail@example.com", "mypwd"));

        // pay by credit card
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));
        
        // pay by Amazon Pay
        cart.pay(new AmazonPayStrategy("myamazonemail@example.com", "mypwd"));
    }
}
