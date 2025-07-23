package com.codewithtopgyal.store;

public interface PaymentService {
    // in real app: we pass payment object that encapsulates payment info
    // like credit card details
    void processPayment(double amount);
}
