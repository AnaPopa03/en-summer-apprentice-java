package com.endava.java2023.DTO;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class OrdersDTO {

    private Integer eventId;
    private Date timestamp;
    private Integer ticketCategoryId;
    private int numberOfTickets;
    private double totalPrice;

    public OrdersDTO(Integer eventId, Date timestamp, int numberOfTickets, double totalPrice) {
        this.eventId = eventId;
        this.timestamp = timestamp;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }
}
