package com.endava.java2023.repository;

import com.endava.java2023.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository  extends  JpaRepository<Customer,Integer>{

     Customer findCustomerById(Integer integer);
}
