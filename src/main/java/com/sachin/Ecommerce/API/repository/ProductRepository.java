package com.sachin.Ecommerce.API.repository;

import com.sachin.Ecommerce.API.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    List<Product> findByCategory(String category);
}
