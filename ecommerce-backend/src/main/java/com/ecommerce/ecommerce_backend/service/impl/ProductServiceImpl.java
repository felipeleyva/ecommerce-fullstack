package com.ecommerce.ecommerce_backend.service.impl;


import com.ecommerce.ecommerce_backend.dao.ProductDAO;
import com.ecommerce.ecommerce_backend.dto.ProductDTO;
import com.ecommerce.ecommerce_backend.exception.*;
import com.ecommerce.ecommerce_backend.model.Product;
import com.ecommerce.ecommerce_backend.repository.ProductRepository;
import com.ecommerce.ecommerce_backend.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    private final ProductDAO productDAO;

    public ProductServiceImpl(ProductRepository productRepository, ProductDAO productDAO) {
        this.productRepository = productRepository;
        this.productDAO = productDAO;
    }

    // Obtener todos los productos (convierte a DTOs)
    @Override
    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(ProductDTO::new)
                .collect(Collectors.toList());
    }

    // Obtener productos en un rango de precios
    @Override
    public List<ProductDTO> getProductsByPriceRange(Double min, Double max) {
        return productDAO.findProductsByPriceRange(min, max)
                .stream()
                .map(ProductDTO::new)
                .collect(Collectors.toList());
    }

    // Obtener un producto por ID
    @Override
    public ProductDTO getProductById(Long id) {
        Optional<Product> product = productRepository.findById(id);
        return product.map(ProductDTO::new).orElse(null);
    }

    // Guardar un nuevo producto
    @Override
    public ProductDTO saveProduct(Product product) {
        Product savedProduct = productRepository.save(product);
        return new ProductDTO(savedProduct);
    }

    @Override
    public ProductDTO updateProduct(Long id, Product product) {
        Optional<Product> existingProduct = productRepository.findById(id);

        if (existingProduct.isEmpty()) {
            throw new ResourceNotFoundException("Producto con ID " + id + " no encontrado.");
        }

        Product updatedProduct = existingProduct.get();
        updatedProduct.setName(product.getName());
        updatedProduct.setPrice(product.getPrice());
        updatedProduct.setImageUrl(product.getImageUrl());

        Product savedProduct = productRepository.save(updatedProduct);
        return new ProductDTO(savedProduct);
    }

    // Eliminar un producto por ID
    @Override
    public void deleteProduct(Long id) {
        if (!productRepository.existsById(id)) {
            throw new ResourceNotFoundException("Producto con ID " + id + " no encontrado.");
        }
        productRepository.deleteById(id);
    }
}
