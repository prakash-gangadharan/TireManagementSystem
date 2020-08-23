package com.tms.orders.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tms.orders.model.Customer;
import com.tms.orders.repository.CustomerRepo;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-orders
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 16/11/17
 * Time: 07.34
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    @Autowired
    CustomerRepo customerRepo;


    @GetMapping
    ResponseEntity<List<Customer>> getCustomers(){
        return new ResponseEntity<List<Customer>>((List<Customer>) customerRepo.findAll(), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        return new ResponseEntity<Customer>(customerRepo.save(customer), HttpStatus.OK);
    }


}
