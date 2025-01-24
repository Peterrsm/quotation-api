package com.pedromiranda.quotation_api.controller.impl;

import com.pedromiranda.quotation_api.controller.interfaces.ICoverageController;
import com.pedromiranda.quotation_api.entity.response.OfferResponse;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@RequestMapping("/coverage")
public class CoverageControllerImpl implements ICoverageController {

    public ResponseEntity<OfferResponse> quotationsCoverage() {
        return null;
    }
}
