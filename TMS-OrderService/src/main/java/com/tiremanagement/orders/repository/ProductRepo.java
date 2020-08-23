package com.tiremanagement.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiremanagement.orders.model.Product;


public interface ProductRepo extends JpaRepository<Product, Long> {
}
