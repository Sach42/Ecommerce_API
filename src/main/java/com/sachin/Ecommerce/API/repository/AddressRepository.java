package com.sachin.Ecommerce.API.repository;

import com.sachin.Ecommerce.API.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}

