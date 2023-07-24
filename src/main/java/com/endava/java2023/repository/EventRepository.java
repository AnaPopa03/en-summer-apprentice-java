package com.endava.java2023.repository;

import com.endava.java2023.DTO.EventDTO;
import com.endava.java2023.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {

    @Query
    List<Event> findEventByVenueIdAndEventTypeName(Integer venueId, String name);
}
