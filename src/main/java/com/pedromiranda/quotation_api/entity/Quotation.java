package com.pedromiranda.quotation_api.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Entity
@Getter
@Setter
@Table(name = "quotation")
@NoArgsConstructor
public class Quotation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    public int insurancePolicyId;

    @Column(nullable = false)
    public String productId;

    @Column(nullable = false)
    public String offerId;

    @Column(unique = true, nullable = false)
    public String category;

    @Column(nullable = false)
    public ZonedDateTime createdAt;

    @Column(nullable = false)
    public ZonedDateTime updatedAt;

    @Column(nullable = false)
    public double totalMonthlyPremiumAmount;

    @Column(nullable = false)
    public double totalCoverageAmount;

    @Column(nullable = false)
    public String coverages;

    @Column(nullable = false)
    public ArrayList<String> assistance;

    @Column(nullable = false)
    public String customer;

}

