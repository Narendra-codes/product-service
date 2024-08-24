package com.narendra.product_service.service;

import com.narendra.product_service.dto.ProductRequest;
import com.narendra.product_service.model.Product;
import com.narendra.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public Product createProduct(ProductRequest productRequest){
        log.info("Product Create Request: {}", productRequest);
    Product response = Product.builder()
            .price(productRequest.getPrice())
            .productName(productRequest.getProductName())
            .description(productRequest.getDescription())
            .build();
    productRepository.save(response);
    return response;
    }

    public List<Product> findAllProducts(){
        return productRepository.findAll();
    }
}
