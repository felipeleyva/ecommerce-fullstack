package com.ecommerce.ecommerce_backend.repository;

import com.ecommerce.ecommerce_backend.model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
