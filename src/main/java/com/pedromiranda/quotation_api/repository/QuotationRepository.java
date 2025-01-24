package com.pedromiranda.quotation_api.repository;

import com.pedromiranda.quotation_api.entity.Quotation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface QuotationRepository extends JpaRepository<Quotation, Long> {
}
