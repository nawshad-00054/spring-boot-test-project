package com.mytestp.testp.error;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.mytestp.testp.entity.ErrorMessage;

@ControllerAdvice
@ResponseStatus
public class RestResponseEntityHandler extends ResponseEntityExceptionHandler{

    @ExceptionHandler(PaymentNotFountException.class)
    public ResponseEntity<ErrorMessage> paymentNotFoundException(PaymentNotFountException exception, WebRequest request)
    {
        ErrorMessage errorMessage = new ErrorMessage( HttpStatus.NOT_FOUND, exception.getMessage() );
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorMessage);
    }
    
}
