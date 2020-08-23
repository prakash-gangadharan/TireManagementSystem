package com.hendisantika.springbootorders.repository;

import com.hendisantika.springbootorders.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepo extends JpaRepository<Orders, Long> {
}
