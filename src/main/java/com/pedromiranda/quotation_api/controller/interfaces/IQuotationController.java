package com.pedromiranda.quotation_api.controller.interfaces;

import com.pedromiranda.quotation_api.entity.request.CoverageRequest;
import com.pedromiranda.quotation_api.entity.response.OfferResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;

public interface IQuotationController {

    @PostMapping("/")
    ResponseEntity<OfferResponse> quotationsCoverage(@RequestBody CoverageRequest request) throws IOException;

}
