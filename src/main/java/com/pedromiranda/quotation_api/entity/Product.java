package com.pedromiranda.quotation_api.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Entity
@Getter
@Setter
@Table(name = "product")
@NoArgsConstructor
public class Product {
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
    public ArrayList<String> offers;

}
