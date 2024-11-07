package com.tienda_agus.sistema_stock.service;

import com.tienda_agus.sistema_stock.entity.ProductEntity;
import com.tienda_agus.sistema_stock.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductEntity> getAllProducts() {
        return productRepository.findAll();
    }

    public ProductEntity getProductById(String id){
        return productRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Producto no encontrado"));
    }

    public ProductEntity createProducts(ProductEntity product){
        return productRepository.save(product);
    }

    public ProductEntity updateProduct(String id, ProductEntity product){

        ProductEntity foundProduct = getProductById(id);

            foundProduct.setNombre(product.getNombre());
            foundProduct.setDescripcion(product.getDescripcion());
            foundProduct.setPrecio(product.getPrecio());

        return foundProduct;
    }

    public ProductEntity deleteProduct(String id){
        ProductEntity foundProduct = getProductById(id);

        productRepository.delete(foundProduct);

        return foundProduct;
    }

}
