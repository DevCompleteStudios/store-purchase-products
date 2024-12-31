package com.devstudios.store.app.purchase.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;




@SpringBootApplication
@EntityScan({"com.devstudios.store.app.purchase.products.domain.entities"})
public class StorePurchaseProductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StorePurchaseProductsApplication.class, args);
	}

}
