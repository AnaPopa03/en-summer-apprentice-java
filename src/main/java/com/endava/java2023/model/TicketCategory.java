package com.endava.java2023.model;

import com.endava.java2023.model.Event;
import com.endava.java2023.model.Orders;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "ticket_category" , schema ="ticket_management_system")
public class TicketCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_category_id")
    private Integer id;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    public TicketCategory(){}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
