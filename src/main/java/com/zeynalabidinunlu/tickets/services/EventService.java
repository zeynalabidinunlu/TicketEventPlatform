package com.zeynalabidinunlu.tickets.services;

import java.util.UUID;

import com.zeynalabidinunlu.tickets.domain.CreateEventRequest;
import com.zeynalabidinunlu.tickets.domain.entities.Event;

public interface EventService {

	Event createEvent(UUID organizerId, CreateEventRequest event);
}
