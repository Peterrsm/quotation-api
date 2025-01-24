package com.pedromiranda.quotation_api.service.interfaces;

import com.pedromiranda.quotation_api.entity.Quotation;
import com.pedromiranda.quotation_api.entity.request.CoverageRequest;
import com.pedromiranda.quotation_api.entity.response.OfferResponse;

import java.io.IOException;
import java.util.Optional;

public interface IQuotationService {

    public OfferResponse quotationsCoverage(CoverageRequest request) throws IOException;
    public Optional<Quotation> retrieveQuotation(Long id);

}
