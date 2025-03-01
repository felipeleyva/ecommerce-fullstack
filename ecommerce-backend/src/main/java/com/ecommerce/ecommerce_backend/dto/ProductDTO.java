package com.ecommerce.ecommerce_backend.dto;


import com.ecommerce.ecommerce_backend.model.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductDTO {
    private String name;
    private Double price;

    public ProductDTO(Product product) {
        this.name = product.getName();
        this.price = product.getPrice();
    }
}
