package com.pedromiranda.quotation_api.entity.request;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class CoverageRequest {
    // Identificadores
    String product_id;
    String offer_id;

    // Informações do seguro
    boolean corporativo;
    boolean interno;
    String category;

    // Valores monetários
    BigDecimal total_monthly_premium_amount;
    BigDecimal total_coverage_amount;

    // Listas de coberturas e assistências
    Map<String, BigDecimal> coverages;
    List<String> assistances;

    // Dados do cliente
    Map<String, String> customer;

}
