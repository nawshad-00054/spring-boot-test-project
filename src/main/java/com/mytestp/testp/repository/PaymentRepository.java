package com.mytestp.testp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mytestp.testp.entity.Payment;


@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{
    
    public Payment findByPaymentAmount(double amount);

    public List<Payment> findByPaymentMethod(String method);

    public Payment findByPaymentMethodIgnoreCase(String name);

}
