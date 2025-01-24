package com.pedromiranda.quotation_api.service.impl;

import com.pedromiranda.quotation_api.entity.Quotation;
import com.pedromiranda.quotation_api.entity.request.CoverageRequest;
import com.pedromiranda.quotation_api.entity.response.OfferResponse;
import com.pedromiranda.quotation_api.repository.QuotationRepository;
import com.pedromiranda.quotation_api.service.exceptions.OfferNotFoundException;
import com.pedromiranda.quotation_api.service.interfaces.IOfferService;
import com.pedromiranda.quotation_api.service.interfaces.IProductService;
import com.pedromiranda.quotation_api.service.interfaces.IQuotationService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Optional;

@Service
@Log4j2
public class QuotationServiceImpl implements IQuotationService {

    @Autowired
    QuotationRepository repository;

    private final IOfferService offerService;
    private final IProductService productService;

    public QuotationServiceImpl(IOfferService offerService, IProductService productService) {
        this.offerService = offerService;
        this.productService = productService;
    }

    public Optional<Quotation> retrieveQuotation(Long id) {
        return repository.findById(id);
    }

    public OfferResponse quotationsCoverage(CoverageRequest request) throws IOException {

        ResponseEntity<String> offer;
        ResponseEntity<String> product;

        //Consultar offer id
        try{
            offer = offerService.retrieveQuotation(request.getOffer_id());
        }
        catch (Exception e){
            throw new OfferNotFoundException();
        }

        //consultar product id
        try{
            product = productService.retrieveQuotation(request.getProduct_id());
        }
        catch (Exception ex){
            throw new OfferNotFoundException();
        }

        //validar se as ofertas estão inclusas nas ofertas das ofertas dentro do produto
        // Seguir daqui
//        try{
//            offerService.validateOffers(offer, product);
//        }
//        catch (Exception ex){
//
//        }

        //validar se as assistencias estão na lista de assistencias da oferta

        // validar se o valor total do prêmio mensal está entre o máximo e mínimo definido para a oferta.

        // validar se o valor total das coberturas corresponde a somatória das coberturas informadas corresponde ao valor total informado das coberturas no corpo da requisição.

        // persistir quotation


        return null;
    }
}
