package com.attaditya.paymentservicesst.controllers;

import com.attaditya.paymentservicesst.dtos.InitiatePaymentRequestDTO;
import com.attaditya.paymentservicesst.services.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public String initiatePayment(@RequestBody InitiatePaymentRequestDTO requestDTO) {
        return paymentService.initiatePayment(
                requestDTO.getOrderId(),
                requestDTO.getEmail()
        );
    }
}
