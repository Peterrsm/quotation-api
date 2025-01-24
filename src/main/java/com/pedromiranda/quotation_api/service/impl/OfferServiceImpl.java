package com.pedromiranda.quotation_api.service.impl;

import com.google.gson.Gson;
import com.pedromiranda.quotation_api.entity.response.OfferResponse;
import com.pedromiranda.quotation_api.service.interfaces.IOfferService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Service
@Log4j2
public class OfferServiceImpl implements IOfferService {

    @Override
    public ResponseEntity<String> retrieveQuotation(String offer_id) throws IOException {
        log.debug(retrieveOffer(offer_id));

        return retrieveOffer(offer_id);
    }

    @Override
    public Object validateOffers(ResponseEntity<String> offer, ResponseEntity<String> product) throws IOException {

        Gson gson = new Gson();
        try {
            String json_final = gson.toJson(offer.getBody());
            OfferResponse user = gson.fromJson(json_final, OfferResponse.class);
            System.out.println("Converted Object: " + user);
        } catch (Exception e) {
            throw new IOException(e.getMessage());
        }

        log.debug("Checking offers");
        return null;
    }

    private ResponseEntity<String> retrieveOffer(String offer_id) throws IOException {

        RestTemplate restTemplate = new RestTemplate();
        String url = "https://93w33.wiremockapi.cloud/offers/" + offer_id;

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        return response;
    }

    private static ResponseEntity<String> getApiResponse() {
        // Simulate a ResponseEntity<String>
        String json = "{\"id\": 1, \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}";
        return ResponseEntity.ok(json);
    }

}
