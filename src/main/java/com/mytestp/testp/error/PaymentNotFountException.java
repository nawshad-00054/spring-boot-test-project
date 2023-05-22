package com.mytestp.testp.error;

public class PaymentNotFountException extends Exception {

    public PaymentNotFountException() {
        super();
    }
    public PaymentNotFountException(String message, Throwable cause) {
        super(message, cause);
    }
    public PaymentNotFountException(String message) {
        super(message);
    }
    public PaymentNotFountException(Throwable cause) {
        super(cause);
    }
}
