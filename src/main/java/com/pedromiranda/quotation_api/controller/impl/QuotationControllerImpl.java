package com.pedromiranda.quotation_api.controller.impl;

import com.pedromiranda.quotation_api.controller.interfaces.IQuotationController;
import com.pedromiranda.quotation_api.entity.request.CoverageRequest;
import com.pedromiranda.quotation_api.entity.response.OfferResponse;
import com.pedromiranda.quotation_api.service.interfaces.IQuotationService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@Log4j2
@RequestMapping("/quotation")
public class QuotationControllerImpl implements IQuotationController {

    @Autowired
    IQuotationService service;

    @Override
    public ResponseEntity<OfferResponse> quotationsCoverage(CoverageRequest request) throws IOException {
        OfferResponse retorno = service.quotationsCoverage(request);

        return ResponseEntity.ok()
                .body(retorno);
    }
}
