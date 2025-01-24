package com.pedromiranda.quotation_api.controller.impl;

import com.pedromiranda.quotation_api.entity.response.OfferResponse;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

@AnalyzeClasses(packages = "com.pedromiranda.quotation_api")
@ExtendWith(MockitoExtension.class)
class CoverageControllerTest {

    @InjectMocks
    CoverageControllerImpl controller;

    @Test
    void quotationsCoverage() {
        ResponseEntity<OfferResponse> result = controller.quotationsCoverage();

        Assertions.assertEquals(HttpStatus.OK, result.getStatusCodeValue());
    }

    @ArchTest
    public static final ArchRule service_accessed_only_by_controller = layeredArchitecture()
            .consideringAllDependencies()
            .layer("service").definedBy("..service.impl")
            .layer("repository").definedBy("..repository")
            .whereLayer("repository").mayOnlyBeAccessedByLayers("service");

    @ArchTest
    public static final ArchRule controller_must_reside_controller = classes()
            .that()
            .haveNameMatching(".*Controller")
            .should()
            .resideInAPackage("..controller.interfaces");

    @ArchTest
    public static final ArchRule controllerimpl_must_reside_controlle_impl = classes()
            .that()
            .haveNameMatching(".*ControllerImpl")
            .should()
            .resideInAPackage("..controller.impl");
}