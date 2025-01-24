package com.pedromiranda.quotation_api.service.interfaces;

import org.springframework.http.ResponseEntity;

import java.io.IOException;

public interface IProductService {

    ResponseEntity<String> retrieveQuotation(String offer_id) throws IOException;

}
