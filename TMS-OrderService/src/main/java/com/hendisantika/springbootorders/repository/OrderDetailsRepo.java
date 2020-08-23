package com.hendisantika.springbootorders.repository;

import com.hendisantika.springbootorders.model.OrderDetails;
import com.hendisantika.springbootorders.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderDetailsRepo extends JpaRepository<OrderDetails, Long> {
}
