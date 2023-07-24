package com.endava.java2023.service;

import com.endava.java2023.DTO.OrderDTO;
import com.endava.java2023.DTO.OrdersDTO;
import com.endava.java2023.model.Customer;
import com.endava.java2023.model.Orders;
import com.endava.java2023.model.TicketCategory;
import com.endava.java2023.repository.CustomerRepository;
import com.endava.java2023.repository.OrdersRepository;
import com.endava.java2023.repository.TicketCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService{

    @Autowired
    private OrdersRepository ordersRepository;
    @Autowired
    private TicketCategoryRepository ticketCategoryRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<OrdersDTO> getOrdersByCustomerId(Integer customerId){
        List<Orders> orders = ordersRepository.findOrderByCustomerId(customerId);
        List<OrdersDTO> ordersDTOS = new ArrayList<>();
        for(Orders order:orders){
            Integer eventId = order.getTicketCategory().getEvent().getId();
            Date timestamp = order.getOrderedAt();
            Integer ticketCategoryId = order.getTicketCategory().getId();
            int numberOfTickets = order.getNumberOfTickets();
            double totalPrice = order.getTotalPrice();
            OrdersDTO ordersDTO = new OrdersDTO(eventId,timestamp,ticketCategoryId,numberOfTickets,totalPrice);
            ordersDTOS.add(ordersDTO);
        }
        return ordersDTOS;
    }

    public Orders saveOrder(OrderDTO orderDTO){
        Integer customerId = 5;
        Customer customer = customerRepository.findCustomerById(customerId);
        TicketCategory ticketCategory = ticketCategoryRepository.findTicketCategoryById(orderDTO.getTicketCategoryId());
        double sum = (double) (orderDTO.getNumberOfTickets() * ticketCategory.getPrice());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        Orders orders = new Orders(new Date(dtf.format(now)),orderDTO.getNumberOfTickets(),customer,sum,ticketCategory);
        ordersRepository.save(orders);
        return orders;
    }
}
