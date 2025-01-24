package com.pedromiranda.quotation_api.service.impl;

import com.pedromiranda.quotation_api.service.interfaces.IProductService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
@Log4j2
public class ProductServiceImpl implements IProductService {

    @Override
    public ResponseEntity<String> retrieveQuotation(String offer_id) throws IOException {
        log.debug("Retrieving Offer");

        return retrieveOffer(offer_id);
    }

    private ResponseEntity<String> retrieveOffer(String offer_id) throws IOException {

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://93w33.wiremockapi.cloud/products/" + offer_id;

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        return response;
    }
}
