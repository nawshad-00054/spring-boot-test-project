package com.mytestp.testp.service;

import java.util.List;

import com.mytestp.testp.entity.PaymentMethod;

public interface PaymentMethodService {
    public PaymentMethod savePaymentMethod(PaymentMethod paymentMethod);

    public List<PaymentMethod> fetchPaymentMethodList();

    public PaymentMethod fetcPaymentMethodById(Long paymentMethodId);

    public String deletePaymentMethodById(Long paymentMethodId);

    public PaymentMethod updatePaymentMethod(Long paymentMethodId, PaymentMethod paymentMethod);
}
