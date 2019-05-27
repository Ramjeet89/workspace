package com.springboot.repository;

import com.springboot.model.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ramjeet on 22/03/16.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
