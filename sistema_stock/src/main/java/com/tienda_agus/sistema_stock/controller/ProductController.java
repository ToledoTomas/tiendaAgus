package com.tienda_agus.sistema_stock.controller;

import com.tienda_agus.sistema_stock.entity.ProductEntity;
import com.tienda_agus.sistema_stock.repository.ProductRepository;
import com.tienda_agus.sistema_stock.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("${id}")
    @ResponseStatus(HttpStatus.OK)
    public ProductEntity getProductById(@PathVariable String id){
        return productService.getProductById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public ProductEntity createProducts(@RequestBody ProductEntity product){
        return productService.createProducts(product);
    }

    @PutMapping("${id}")
    @ResponseStatus(HttpStatus.OK)
    public ProductEntity updateProduct(@PathVariable String id, @RequestBody ProductEntity product){
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("${id}")
    @ResponseStatus(HttpStatus.OK)
    public ProductEntity deleteProduct(@PathVariable String id){
        return productService.deleteProduct(id);
    }

}