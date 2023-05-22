package com.mytestp.testp.service.Impl;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytestp.testp.entity.Payment;
import com.mytestp.testp.error.PaymentNotFountException;
import com.mytestp.testp.repository.PaymentRepository;
import com.mytestp.testp.service.PaymentService;


@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment savePayment(Payment payment) {
        // TODO Auto-generated method stub
       return paymentRepository.save(payment);
    }

    @Override
    public List<Payment> fetchPaymentList() {
        // TODO Auto-generated method stub
        return paymentRepository.findAll();
    }

    @Override
    public Payment fetchPaymentById(Long paymentId) throws PaymentNotFountException {
        // TODO Auto-generated method stub
        Optional<Payment> payment = paymentRepository.findById(paymentId);

        if( !payment.isPresent() )
        {
            throw new PaymentNotFountException("Payment Not Found");
            
        }

        return payment.get();
    }

    @Override
    public String deletePaymentById(Long paymentId) {
        // TODO Auto-generated method stub
        paymentRepository.deleteById(paymentId);

        return null;
    }

    @Override
    public Payment updatePayment(Long paymentId, Payment payment) {
        // TODO Auto-generated method stub
        Payment pmnt =  paymentRepository.findById(paymentId).get();

        if( Objects.nonNull( payment.getPaymentAmount()) && payment.getPaymentAmount() > 0)
        {
            pmnt.setPaymentAmount(payment.getPaymentAmount());
        }

        if( Objects.nonNull( payment.getPaymentMethod() ) && !"".equalsIgnoreCase(payment.getPaymentMethod()))
        {
            pmnt.setPaymentMethod(payment.getPaymentMethod());
        } 

        if( Objects.nonNull( payment.getPaidByName() ) && !"".equalsIgnoreCase(payment.getPaidByName()))
        {
            pmnt.setPaidByName(payment.getPaidByName());
        } 
        return paymentRepository.save(pmnt);
        
    }

    @Override
    public List<Payment> fetchPaymentByMethod(String paymentMethod) throws PaymentNotFountException {
        // TODO Auto-generated method stub
        List<Payment> payment = paymentRepository.findByPaymentMethod(paymentMethod);

        if( payment.isEmpty() )
        {
            throw new PaymentNotFountException("No payment found for this method");
            
        }

        return payment;
    }
    

}
