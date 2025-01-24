package com.pedromiranda.quotation_api.entity.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@Builder
@ToString
public class ProductResponse {
    String id;
    String product_id;
    String name;
    String created_at;
    String active;
    Map<String, BigDecimal> coverages;
    List<String> assistances;
    Map<String, BigDecimal> monthly_premium_amount;

}
