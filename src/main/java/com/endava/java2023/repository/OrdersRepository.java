package com.endava.java2023.repository;

import com.endava.java2023.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Integer> {

    @Query
    List<Orders> findOrderByCustomerId(Integer userId);


}
