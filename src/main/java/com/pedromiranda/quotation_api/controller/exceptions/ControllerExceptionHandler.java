package com.pedromiranda.quotation_api.controller.exceptions;

import com.pedromiranda.quotation_api.service.exceptions.OfferNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(OfferNotFoundException.class)
    public ResponseEntity<StandardError> offerNotFound(OfferNotFoundException ex, HttpServletRequest request) {
        String err = "OFFER NOT FOUND";
        HttpStatus status = HttpStatus.NOT_FOUND;
        StandardError error = StandardError.builder()
                .timestamp(LocalDateTime.now())
                .status(status.value())
                .error(ex.getMessage())
                .message(err)
                .path(request.getRequestURI())
                .build();

        return ResponseEntity
                .status(status)
                .body(error);
    }

}
