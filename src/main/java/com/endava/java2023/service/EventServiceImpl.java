package com.endava.java2023.service;

import com.endava.java2023.DTO.EventDTO;
import com.endava.java2023.model.Event;
import com.endava.java2023.model.TicketCategory;
import com.endava.java2023.model.Venue;
import com.endava.java2023.repository.EventRepository;
import com.endava.java2023.repository.TicketCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private TicketCategoryRepository ticketCategoryRepository;

    @Override
    public List<EventDTO> getEvents(Integer id, String eventTypeName){
       List <Event> events = eventRepository.findEventByVenueIdAndEventTypeName(id,eventTypeName);
       List <EventDTO> eventDTOS = new ArrayList<>();
       for(Event event:events){
           Integer eventId = event.getId();
           Venue venue = event.getVenue();
           String description = event.getDescription();
           String name = event.getName();
           Date startDate = event.getStartDate();
           Date endDate = event.getEndDate();
           List<TicketCategory> ticketCategories = ticketCategoryRepository.findTicketCategoriesByEventId(eventId);
           EventDTO eventDTO = new EventDTO(eventId,venue,eventTypeName,description,name,startDate,endDate,ticketCategories);
           eventDTOS.add(eventDTO);
       }
        return eventDTOS;
    }
}
