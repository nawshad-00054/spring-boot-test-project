package com.mytestp.testp.entity;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long paymentId;

    @NotNull( message = "Payment amount can not be empty")
    @Min(value = 0, message = "Age should not be less than 0")
    @Max(value = 1000000000, message = "Age should not be greater than 1000000000")
    private double paymentAmount;

    @NotNull( message = "Payment amount can not be empty")
    @Length(max = 22, min = 2)
    // @Future
    // @FutureOrPresent
    // @Size
    private String paymentMethod;

    @Column( name = "paidByName", nullable = false)
    @NotEmpty
    private String paidByName;

    private int paidById;
}
