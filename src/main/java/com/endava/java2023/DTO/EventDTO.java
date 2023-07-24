package com.endava.java2023.DTO;


import com.endava.java2023.model.TicketCategory;
import com.endava.java2023.model.Venue;
import java.util.Date;
import java.util.List;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Setter
@Getter
@NoArgsConstructor
public class EventDTO {

      private Integer id;
      private Venue venue;
      private String type;
      private String description;
      private String name;
      private Date startDate;
      private Date endDate;
      private List<TicketCategory> ticketCategories;

      public EventDTO(Integer id, Venue venue, String type, String description, String name, Date startDate, Date endDate, List<TicketCategory> ticketCategories) {
            this.id = id;
            this.venue = venue;
            this.type = type;
            this.description = description;
            this.name = name;
            this.startDate = startDate;
            this.endDate = endDate;
            this.ticketCategories = ticketCategories;
      }
}
