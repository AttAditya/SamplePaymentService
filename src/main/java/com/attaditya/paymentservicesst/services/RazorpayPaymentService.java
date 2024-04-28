package com.attaditya.paymentservicesst.services;

import com.attaditya.paymentservicesst.services.PaymentGateways.PaymentGateway;
import com.razorpay.RazorpayException;
import org.springframework.stereotype.Service;

@Service
public class RazorpayPaymentService implements PaymentService {
    private final PaymentGateway paymentGateway;

    public RazorpayPaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String initiatePayment(Long orderID, String email) {
        try {
            return paymentGateway.generatePaymentLink(orderID, email);
        } catch (RazorpayException razorpayException) {
            return razorpayException.getMessage();
        }
    }
}
