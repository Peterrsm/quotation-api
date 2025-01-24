package com.pedromiranda.quotation_api.service.interfaces;

import org.springframework.http.ResponseEntity;

import java.io.IOException;

public interface IOfferService {

    ResponseEntity<String> retrieveQuotation(String offer_id) throws IOException;

    Object validateOffers(ResponseEntity<String> offer, ResponseEntity<String> product) throws IOException;
}
