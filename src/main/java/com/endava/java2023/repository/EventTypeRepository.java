package com.endava.java2023.repository;

import com.endava.java2023.model.EventType;
import com.endava.java2023.model.TicketCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EventTypeRepository extends JpaRepository<EventType,Integer> {

}
