package com.pedromiranda.quotation_api.service.impl;

import com.tngtech.archunit.junit.AnalyzeClasses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@AnalyzeClasses(packages = "com.pedromiranda.quotation_api")
@ExtendWith(MockitoExtension.class)
class OfferServiceImplTest {

    @InjectMocks
    OfferServiceImpl service;

    @Test
    void retrieveQuotation() throws IOException {

        ResponseEntity<String> result = service.retrieveQuotation("1098");

        Assertions.assertEquals(HttpStatus.OK, result.getStatusCodeValue());
    }

    @Test
    void validateOffers() {
        Assertions.assertThrows(IOException.class, () -> service.validateOffers(null, null));
    }
}