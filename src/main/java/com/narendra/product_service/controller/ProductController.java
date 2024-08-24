package com.narendra.product_service.controller;

import com.narendra.product_service.dto.ProductRequest;
import com.narendra.product_service.model.Product;
import com.narendra.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/service/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;
    @PostMapping(path = "/create")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Product> createProduct(@RequestBody ProductRequest productRequest){
        return ResponseEntity.ok(productService.createProduct(productRequest));
    }

    @GetMapping(path = "/get")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Product>> findAllProducts(){
        return ResponseEntity.ok(productService.findAllProducts());
    }
}
