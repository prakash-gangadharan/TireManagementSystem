package com.tms.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tms.orders.model.Product;


public interface ProductRepo extends JpaRepository<Product, Long> {
}
