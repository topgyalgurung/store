package com.codewithtopgyal.store;

public class StripePaymentService implements PaymentService {
    // in real app: we pass payment object that encapsulates payment info
    // like credit card details
    @Override
    public void processPayment(double amount) {
        System.out.println("STRIPE");
        System.out.println("Amount: " + amount);
    }
}
