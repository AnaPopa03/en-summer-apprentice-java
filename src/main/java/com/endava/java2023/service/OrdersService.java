package com.endava.java2023.service;

import com.endava.java2023.DTO.OrderDTO;
import com.endava.java2023.DTO.OrdersDTO;
import com.endava.java2023.model.Orders;

import java.util.List;

public interface OrdersService {

    List<OrdersDTO> getOrdersByCustomerId(Integer customerId);

    Orders saveOrder(OrderDTO orderDTO);
}
