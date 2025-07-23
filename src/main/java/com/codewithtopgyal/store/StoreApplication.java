package com.codewithtopgyal.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args){
//        SpringApplication.run(StoreApplication.class, args);

        // var orderService = new OrderService(new StripePaymentService());
        // to use new orderservice
//       var orderService = new OrderService(new PayPalPaymentService());

        // problem this is if we forget setPaymentService, we get NullPointerException
        // so we should use this approach for optional dependency
        // in this case, payment service is not optional dependency
        // does not make sense to inject my setter

        // ioc container
        // instead of us manually creating objects and injecting dependency we let
        // spring take care of that for us by using App context and using getBean method
//        var orderService = new OrderService();
//        orderService.setPaymentService(new PayPalPaymentService());
//        orderService.placeOrder();

        ApplicationContext context = SpringApplication.run(StoreApplication.class, args); // return object of type app context(ioc container storage for objects)
        var orderService = context.getBean(OrderService.class);
        orderService.placeOrder();
    }

}
