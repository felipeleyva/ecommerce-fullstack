package com.ecommerce.ecommerce_backend.dao;


import com.ecommerce.ecommerce_backend.model.Product;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public List<Product> findProductsByPriceRange(Double minPrice, Double maxPrice) {
        return entityManager.createQuery("SELECT p FROM Product p WHERE p.price BETWEEN :min AND :max", Product.class)
                .setParameter("min", minPrice)
                .setParameter("max", maxPrice)
                .getResultList();
    }
}
