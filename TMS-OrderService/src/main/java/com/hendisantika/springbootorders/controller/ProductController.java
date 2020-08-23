package com.hendisantika.springbootorders.controller;

import com.hendisantika.springbootorders.model.Orders;
import com.hendisantika.springbootorders.model.Product;
import com.hendisantika.springbootorders.repository.ProductRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductRepo productRepo;

    @GetMapping
    ResponseEntity<List<Product>> getOrders(){
        return new ResponseEntity<List<Product>>((List<Product>) productRepo.findAll(), HttpStatus.OK);
    }

    @PostMapping
    ResponseEntity<Product> saveOrder(@RequestBody Product product){
        return new ResponseEntity<Product>(productRepo.save(product), HttpStatus.OK);
    }
}
