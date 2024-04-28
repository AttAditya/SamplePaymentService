package com.attaditya.paymentservicesst.services.PaymentGateways;

import com.razorpay.RazorpayException;

public interface PaymentGateway {
    String generatePaymentLink(Long orderId, String email) throws RazorpayException;
}
