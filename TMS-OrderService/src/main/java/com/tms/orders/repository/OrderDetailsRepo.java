package com.tms.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tms.orders.model.OrderDetails;
import com.tms.orders.model.Orders;


public interface OrderDetailsRepo extends JpaRepository<OrderDetails, Long> {
}
