package com.endava.java2023.controller;

import com.endava.java2023.DTO.OrderDTO;
import com.endava.java2023.DTO.OrderResponseDTO;
import com.endava.java2023.DTO.OrdersDTO;
import com.endava.java2023.model.Orders;
import com.endava.java2023.service.OrdersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrdersController {

    @Autowired
    private OrdersServiceImpl ordersService;

    @GetMapping("/api/orders")
    public List<OrdersDTO> getAllOrders(){
        return ordersService.getOrdersByCustomerId(4);
    }

    @PostMapping("/api/orders/addOrder")
    public OrderResponseDTO saveOrder(@RequestBody OrderDTO orderDTO){
        Orders order = ordersService.saveOrder(orderDTO);
        return transformOrderDTO(orderDTO.getEventId(),order);
    }

    public OrderResponseDTO transformOrderDTO(Integer eventId, Orders orders){
        OrderResponseDTO orderResponseDTO = new OrderResponseDTO();
        orderResponseDTO.setEventId(eventId);
        orderResponseDTO.setTimestamp(orders.getOrderedAt());
        orderResponseDTO.setTicketCategoryId(orders.getTicketCategory().getId());
        orderResponseDTO.setNumberOfTickets(orders.getNumberOfTickets());
        orderResponseDTO.setTotalPrice(orders.getTotalPrice());
        return orderResponseDTO;
    }
}
