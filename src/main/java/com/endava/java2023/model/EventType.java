package com.endava.java2023.model;


import com.endava.java2023.model.Event;
import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "event_type", schema ="ticket_management_system")
public class EventType implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_type_id")
    private Integer id;

    @Column(name = "event_type_name")
    private String name;

    public String getEventTypeName() {
        return name;
    }

    public void setEventTypeName(String eventTypeName) {
        this.name = eventTypeName;
    }
}
