package com.mytestp.testp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mytestp.testp.entity.PaymentMethod;
import com.mytestp.testp.service.PaymentMethodService;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class PaymentMethodController {
    @Autowired
    private PaymentMethodService paymentMethodService;

    @RequestMapping("/payment-methods")
    public PaymentMethod savePaymentMethod(@Valid @RequestBody PaymentMethod paymentMethod){
        return paymentMethodService.savePaymentMethod(paymentMethod);
    }

    @GetMapping("/payment-methods")
    public List<PaymentMethod> fetchPaymentMethodList(){
        return paymentMethodService.fetchPaymentMethodList();
    }
}
