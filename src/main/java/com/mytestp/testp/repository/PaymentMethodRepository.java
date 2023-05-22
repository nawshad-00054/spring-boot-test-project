package com.mytestp.testp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mytestp.testp.entity.PaymentMethod;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long>{
    
}
