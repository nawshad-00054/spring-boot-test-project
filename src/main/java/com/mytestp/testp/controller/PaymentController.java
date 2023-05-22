package com.mytestp.testp.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.validation.annotation.Validated;

import com.mytestp.testp.entity.Payment;
import com.mytestp.testp.error.PaymentNotFountException;
import com.mytestp.testp.service.PaymentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping("/")
    public String hello(){
        return "Hello world, nawshad here";
    }

    @PostMapping("/payments")
    public Payment savePayment(@Validated @RequestBody Payment payment) throws MethodArgumentNotValidException{
        
        return paymentService.savePayment( payment );
    }


    @GetMapping("/payments")
    public List<Payment> fetchPaymentList(){
        return paymentService.fetchPaymentList();
    }
    
    @GetMapping("/payment/{id}")
    public Payment fetchPaymentById( @PathVariable("id") Long paymentId ) throws PaymentNotFountException 
    {
        return paymentService.fetchPaymentById(paymentId);
    }

    @DeleteMapping("/payment/{id}")
    public String deletePaymentById( @PathVariable("id") Long paymentId )
    {
        paymentService.deletePaymentById(paymentId);
        return "Payment deleted successfully";
    }

    @PutMapping("/payment/{id}")
    public Payment updatePayment(@PathVariable("id") Long paymentId, @RequestBody Payment payment ) {
        return paymentService.updatePayment(paymentId, payment);
    }

    @GetMapping("/payment/by-method/{method}")
    public List<Payment> fetchPaymentByMethod( @PathVariable("method") String paymentMethod ) throws PaymentNotFountException 
    {
        return paymentService.fetchPaymentByMethod(paymentMethod);
    }
}
