package com.hendisantika.springbootorders.repository;

import com.hendisantika.springbootorders.model.Customer;
import org.springframework.data.repository.CrudRepository;


public interface CustomerRepo extends CrudRepository<Customer, Long> {
}
