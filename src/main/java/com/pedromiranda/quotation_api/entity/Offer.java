package com.pedromiranda.quotation_api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

@Entity
@Getter
@Setter
@Table(name = "offer")
@NoArgsConstructor
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    public String productId;

    @Column(nullable = false)
    public String name;

    @Column(nullable = false)
    public LocalDateTime createdAt;

    @Column(nullable = false)
    public boolean active;

    @Column(nullable = false)
    public String coverages;

    @Column(nullable = false)
    public String assistance;

    @Column(nullable = false)
    public String monthlyPremiumAmount;

}
