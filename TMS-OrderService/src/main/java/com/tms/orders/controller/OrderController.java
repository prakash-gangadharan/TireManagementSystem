package com.tms.orders.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tms.orders.model.OrderDetails;
import com.tms.orders.model.Orders;
import com.tms.orders.repository.OrderDetailsRepo;
import com.tms.orders.repository.OrderRepo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-orders
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 18/11/17
 * Time: 19.30
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    @Autowired
    OrderRepo orderRepo;
    
    @Autowired
    OrderDetailsRepo orderDetailsRepo;

    @GetMapping
    ResponseEntity<List<Orders>> getOrders(){
        return new ResponseEntity<List<Orders>>((List<Orders>) orderRepo.findAll(), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Orders> saveOrder(@RequestBody Orders orders){
        return new ResponseEntity<Orders>(orderRepo.save(orders), HttpStatus.OK);
    }

    @PostMapping("/orderDetails")
    ResponseEntity<OrderDetails> saveOrderDetails(@RequestBody OrderDetails orders){
        return new ResponseEntity<OrderDetails>(orderDetailsRepo.save(orders), HttpStatus.OK);
    }
    
}
