package com.pedromiranda.quotation_api.entity.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
@Builder
@ToString
public class ProductResponse_aux {

    private String id;
    private String name;
    private ZonedDateTime createdAt;
    private boolean active;
    private List<String> offers;

}
