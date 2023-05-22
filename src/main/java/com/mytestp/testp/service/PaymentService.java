package com.mytestp.testp.service;

import java.util.List;

import com.mytestp.testp.entity.Payment;
import com.mytestp.testp.error.PaymentNotFountException;

public interface PaymentService {
    public Payment savePayment(Payment payment);

    public List<Payment> fetchPaymentList();

    public Payment fetchPaymentById(Long paymentId) throws PaymentNotFountException;

    public String deletePaymentById(Long paymentId);

    public Payment updatePayment(Long paymentId, Payment payment);

    public List<Payment> fetchPaymentByMethod(String paymentMethod) throws PaymentNotFountException;

    //public Payment fetchPaymentByMethod(String paymentName);
}
