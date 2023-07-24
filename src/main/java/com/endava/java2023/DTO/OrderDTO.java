package com.endava.java2023.DTO;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private Integer eventId;

    private Integer ticketCategoryId;

    private int numberOfTickets;


}
