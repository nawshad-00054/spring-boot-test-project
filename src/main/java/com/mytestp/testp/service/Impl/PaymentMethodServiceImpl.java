package com.mytestp.testp.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mytestp.testp.entity.PaymentMethod;
import com.mytestp.testp.repository.PaymentMethodRepository;
import com.mytestp.testp.service.PaymentMethodService;

@Service
public class PaymentMethodServiceImpl implements PaymentMethodService{
    @Autowired
    private PaymentMethodRepository paymentMethodRepository;

    @Override
    public PaymentMethod savePaymentMethod(PaymentMethod paymentMethod) {
        // TODO Auto-generated method stub
        return paymentMethodRepository.save(paymentMethod);
    }

    @Override
    public List<PaymentMethod> fetchPaymentMethodList() {
        // TODO Auto-generated method stub
        return paymentMethodRepository.findAll();
    }

    @Override
    public PaymentMethod fetcPaymentMethodById(Long paymentMethodId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'fetcPaymentMethodById'");
    }

    @Override
    public String deletePaymentMethodById(Long paymentMethodId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePaymentMethodById'");
    }

    @Override
    public PaymentMethod updatePaymentMethod(Long paymentMethodId, PaymentMethod paymentMethod) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePaymentMethod'");
    }
    
}
