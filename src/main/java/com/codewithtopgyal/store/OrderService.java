package com.codewithtopgyal.store;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

// this implementation OrderService dependent on StripePaymentService which we do not want
// we can not test OrderService in isolation
// @Component for utility class, @service is alias of component but used for business logic
@Service
public class OrderService {
    // setter
    private PaymentService paymentService;

    // with these we need @Autowired for OrderService
    // public OrderService() {}
    // public OrderService(PaymentService paymentService, int x){}

    // @Autowired not required if class has single constructor
    public OrderService(PaymentService paymentService){
        this.paymentService = paymentService;
    }

    // in real app: we need to provide order object
    //    public void placeOrder(Order order)
    public void placeOrder() {
//            var paymentService = new StripePaymentService();
            paymentService.processPayment(10);
    }
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }
}
