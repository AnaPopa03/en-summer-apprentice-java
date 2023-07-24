package com.endava.java2023.service;

import com.endava.java2023.DTO.EventDTO;
import com.endava.java2023.model.Event;

import java.util.List;

public interface EventService{

    public List<EventDTO> getEvents(Integer id, String name);
}
