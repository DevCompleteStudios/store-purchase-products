package com.devstudios.store.app.purchase.products.presentation.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;



@RestController
public class PurchaseProductsController {
    
    @GetMapping
    public Mono<ResponseEntity<?>> findAll(){
        return null;
    }

}
