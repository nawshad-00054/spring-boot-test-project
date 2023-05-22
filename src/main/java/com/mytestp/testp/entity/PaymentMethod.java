package com.mytestp.testp.entity;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PaymentMethod {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long paymentMethodId;

    @NotNull(message = "Payment method name is required")
    @Length(max = 22, min = 2)
    @NotEmpty(message = "Payment method name can not be empty")
    private String paymentMethodName;
}
