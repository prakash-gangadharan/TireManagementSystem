package com.hendisantika.springbootorders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hendisantika.springbootorders.model.Product;


public interface ProductRepo extends JpaRepository<Product, Long> {
}
