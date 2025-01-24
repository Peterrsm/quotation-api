package com.pedromiranda.quotation_api.controller.impl;

import com.pedromiranda.quotation_api.entity.response.OfferResponse;
import com.pedromiranda.quotation_api.service.interfaces.IQuotationService;
import com.tngtech.archunit.junit.AnalyzeClasses;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import stubs.CoverageRequestStub;
import stubs.OfferResponseStub;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

@AnalyzeClasses(packages = "com.pedromiranda.quotation_api")
@ExtendWith(MockitoExtension.class)
class QuotationControllerImplTest {

    @Mock
    IQuotationService service;

    @InjectMocks
    QuotationControllerImpl controller;

    @Test
    void quotationsCoverage() throws IOException {
        CoverageRequestStub stub = new CoverageRequestStub();
        OfferResponseStub offerResponseStub = new OfferResponseStub();

        Mockito.when(service.quotationsCoverage(Mockito.any()))
                .thenReturn(offerResponseStub.create());

        ResponseEntity<OfferResponse> result = controller.quotationsCoverage(stub.create());


    }
}