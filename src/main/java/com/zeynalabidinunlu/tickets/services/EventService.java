package com.zeynalabidinunlu.tickets.services;

import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.zeynalabidinunlu.tickets.domain.CreateEventRequest;
import com.zeynalabidinunlu.tickets.domain.entities.Event;

public interface EventService {

	Event createEvent(UUID organizerId, CreateEventRequest event);
	Page<Event> listEventsForOrganizer(UUID organizerId,Pageable pageable);
	
}
