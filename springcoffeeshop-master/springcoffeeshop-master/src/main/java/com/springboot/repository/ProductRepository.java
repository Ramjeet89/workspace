package com.springboot.repository;

import com.springboot.model.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ramjeet on 22/03/19.
 */
public interface ProductRepository extends CrudRepository<Product, Long> {

}




