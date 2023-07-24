package com.endava.java2023.controller;

import com.endava.java2023.DTO.EventDTO;
import com.endava.java2023.model.Event;
import com.endava.java2023.service.EventService;
import com.endava.java2023.service.EventServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
public class EventController {

    @Autowired
    private EventServiceImpl eventService;

    @GetMapping("/api/events")
    public List<EventDTO> getEventsByVenueAndType(@RequestParam Integer id, @RequestParam String name){
       return eventService.getEvents(id,name);
    }
}
