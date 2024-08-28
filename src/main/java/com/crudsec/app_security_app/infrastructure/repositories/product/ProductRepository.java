package com.crudsec.app_security_app.infrastructure.repositories.product;

import org.springframework.data.repository.CrudRepository;

import com.crudsec.app_security_app.domain.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
    
}
