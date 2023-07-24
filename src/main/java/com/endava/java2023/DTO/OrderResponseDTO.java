package com.endava.java2023.DTO;

import java.util.Date;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponseDTO {

    private Integer eventId;
    private Date timestamp;

    private Integer ticketCategoryId;

    private int numberOfTickets;

    private double totalPrice;

}
