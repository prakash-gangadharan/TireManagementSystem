package com.tms.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tms.orders.model.Orders;


public interface OrderRepo extends JpaRepository<Orders, Long> {
}
