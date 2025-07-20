package com.fabianesilva.events_microservice.controllers;

import com.fabianesilva.events_microservice.domain.Event;
import com.fabianesilva.events_microservice.dtos.EventRequestDTO;
import com.fabianesilva.events_microservice.dtos.SubscriptionRequestDTO;
import com.fabianesilva.events_microservice.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService eventService;

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/upcoming")
    public List<Event> getUpcomingEvents() {
        return eventService.getUpcomingEvents();
    }

    @PostMapping
    public Event createEvent(@RequestBody EventRequestDTO event) {
        return eventService.createEvent(event);
    }

    @PostMapping("/{Id}/register")
    public void registerParticipant(@PathVariable String Id, @RequestBody SubscriptionRequestDTO subscriptionRequest) {
        eventService.registerParticipant(Id, subscriptionRequest.participantEmail());
    }

}
