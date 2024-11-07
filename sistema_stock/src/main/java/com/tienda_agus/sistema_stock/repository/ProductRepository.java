package com.tienda_agus.sistema_stock.repository;

import com.tienda_agus.sistema_stock.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity, String> {
}
