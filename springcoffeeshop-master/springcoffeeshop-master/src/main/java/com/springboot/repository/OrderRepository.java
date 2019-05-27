package com.springboot.repository;

import com.springboot.model.CustomerOrder;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Ramjeet on 22/03/19.
 */
public interface OrderRepository extends CrudRepository<CustomerOrder,Long>{

}
