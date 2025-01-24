package stubs;

import com.pedromiranda.quotation_api.entity.response.OfferResponse;

import java.time.LocalDateTime;

public class OfferResponseStub {

    public OfferResponse create(){
        OfferResponse offerResponse = OfferResponse.builder().build();

        offerResponse.setCreatedAt(LocalDateTime.now());

        return offerResponse;
    }
}
