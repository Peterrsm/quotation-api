package com.pedromiranda.quotation_api.service.exceptions;

public class OfferNotFoundException extends RuntimeException {

    public OfferNotFoundException() {
        super("Offer not found.");
    }
}
