package com.ecommerce.ecommerce_backend.service;

import com.ecommerce.ecommerce_backend.dto.ProductDTO;
import com.ecommerce.ecommerce_backend.model.Product;

import java.util.List;

public interface ProductService {
    List<ProductDTO> getAllProducts();
    List<ProductDTO> getProductsByPriceRange(Double min, Double max);
    ProductDTO getProductById(Long id);
    ProductDTO saveProduct(Product product);
    ProductDTO updateProduct(Long id, Product product);
    void deleteProduct(Long id);
}
