package com.sachin.Ecommerce.API.repository;

import com.sachin.Ecommerce.API.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
