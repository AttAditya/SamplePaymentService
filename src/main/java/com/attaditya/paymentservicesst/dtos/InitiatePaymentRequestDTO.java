package com.attaditya.paymentservicesst.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitiatePaymentRequestDTO {
    private Long orderId;
    private String email;
}
