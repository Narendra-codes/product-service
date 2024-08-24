package com.narendra.product_service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.math.BigDecimal;
@Data
public class ProductRequest {
    private String productName;
    private String description;
    private BigDecimal price;

}
