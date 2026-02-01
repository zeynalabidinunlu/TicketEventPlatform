package com.zeynalabidinunlu.tickets.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.zeynalabidinunlu.tickets.domain.CreateEventRequest;
import com.zeynalabidinunlu.tickets.domain.entities.Event;
import com.zeynalabidinunlu.tickets.domain.entities.TicketType;
import com.zeynalabidinunlu.tickets.domain.entities.User;
import com.zeynalabidinunlu.tickets.repositories.EventRepository;
import com.zeynalabidinunlu.tickets.repositories.UserRepository;
import com.zeynalabidinunlu.tickets.services.EventService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

	private final UserRepository userRepository;
	private final EventRepository eventRepository;

	@Override
	public Event createEvent(UUID organizerId, CreateEventRequest event) {
		User organizer = userRepository.findById(organizerId).orElseThrow(
				() -> new UsernameNotFoundException(String.format("User with ID '%s' not found", organizerId)));
		Event eventToCreate = new Event();

		List<TicketType> ticketTypesToCreate = event.getTicketTypes().stream().map(ticketType -> {
			TicketType ticketTypeToCreate = new TicketType();
			ticketTypeToCreate.setName(ticketType.getName());
			ticketTypeToCreate.setPrice(ticketType.getPrice());
			ticketTypeToCreate.setDescription(ticketType.getDescription());
			ticketTypeToCreate.setTotalAvailable(ticketType.getTotalAvailable());
			ticketTypeToCreate.setEvent(eventToCreate);
			return ticketTypeToCreate;
		}).toList();

		eventToCreate.setName(event.getName());
		eventToCreate.setStartTime(event.getStartTime());
		eventToCreate.setEndTime(event.getEndTime());
		eventToCreate.setVenue(event.getVenue());
		eventToCreate.setSalesStart(event.getSalesStart());
		eventToCreate.setSalesEnd(event.getSalesEnd());
		eventToCreate.setStatus(event.getStatus());
		eventToCreate.setOrganizer(organizer);
		eventToCreate.setTicketTypes(ticketTypesToCreate);

		return eventRepository.save(eventToCreate);
	}

	@Override
	public Page<Event> listEventsForOrganizer(UUID organizerId, Pageable pageable) {
		return eventRepository.findByOrganizerId(organizerId, pageable);

	}

}
