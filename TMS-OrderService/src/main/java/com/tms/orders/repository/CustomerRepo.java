package com.tms.orders.repository;

import org.springframework.data.repository.CrudRepository;

import com.tms.orders.model.Customer;


public interface CustomerRepo extends CrudRepository<Customer, Long> {
}
