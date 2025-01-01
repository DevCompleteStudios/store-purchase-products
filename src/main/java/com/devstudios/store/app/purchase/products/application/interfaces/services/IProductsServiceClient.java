package com.devstudios.store.app.purchase.products.application.interfaces.services;


import com.devstudios.store.app.commons.entities.store.Product;

import reactor.core.publisher.Mono;




public interface IProductsServiceClient {
    Mono<Product> findById(String id);
}
