package com.endava.java2023.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "orders", schema ="ticket_management_system")
public class Orders implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer id;

    @Column(name = "number_of_tickets")
    private int numberOfTickets;

    @Column(name = "ordered_at")
    private Date orderedAt;

    @Column(name = "total_price")
    private double totalPrice;

    @ManyToOne
    @JoinColumn(name = "ticket_category_id")
    private TicketCategory ticketCategory;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Orders(Date orderedAt,int numberOfTickets, Customer customer,double totalPrice, TicketCategory ticketCategory) {
        this.numberOfTickets = numberOfTickets;
        this.orderedAt = orderedAt;
        this.totalPrice = totalPrice;
        this.ticketCategory = ticketCategory;
        this.customer = customer;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(int numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public Date getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(Date orderedAt) {
        this.orderedAt = orderedAt;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TicketCategory getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(TicketCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
