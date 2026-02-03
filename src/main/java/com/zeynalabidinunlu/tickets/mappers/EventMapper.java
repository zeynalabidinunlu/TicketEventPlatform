package com.zeynalabidinunlu.tickets.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.zeynalabidinunlu.tickets.domain.CreateEventRequest;
import com.zeynalabidinunlu.tickets.domain.CreateTicketTypeRequest;
import com.zeynalabidinunlu.tickets.domain.UpdateEventRequest;
import com.zeynalabidinunlu.tickets.domain.UpdateTicketTypeRequest;
import com.zeynalabidinunlu.tickets.domain.dtos.CreateEventRequestDto;
import com.zeynalabidinunlu.tickets.domain.dtos.CreateEventResponseDto;
import com.zeynalabidinunlu.tickets.domain.dtos.CreateTicketTypeRequestDto;
import com.zeynalabidinunlu.tickets.domain.dtos.GetEventDetailsResponseDto;
import com.zeynalabidinunlu.tickets.domain.dtos.GetEventDetailsTicketTypesResponseDto;
import com.zeynalabidinunlu.tickets.domain.dtos.GetEventPublishedDetailsResponseDto;
import com.zeynalabidinunlu.tickets.domain.dtos.GetPublishedEventDetailsTicketTypesResponseDto;
import com.zeynalabidinunlu.tickets.domain.dtos.ListEventResponseDto;
import com.zeynalabidinunlu.tickets.domain.dtos.ListEventTicketTypeResponseDto;
import com.zeynalabidinunlu.tickets.domain.dtos.ListPublishedEventResponseDto;
import com.zeynalabidinunlu.tickets.domain.dtos.UpdateEventRequestDto;
import com.zeynalabidinunlu.tickets.domain.dtos.UpdateEventResponseDto;
import com.zeynalabidinunlu.tickets.domain.dtos.UpdateTicketTypeRequestDto;
import com.zeynalabidinunlu.tickets.domain.dtos.UpdateTicketTypeResponseDto;
import com.zeynalabidinunlu.tickets.domain.entities.Event;
import com.zeynalabidinunlu.tickets.domain.entities.TicketType;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {

	CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto);

	CreateEventRequest fromDto(CreateEventRequestDto dto);

	CreateEventResponseDto toDto(Event event);

	ListEventTicketTypeResponseDto toDto(TicketType ticketType);

	ListEventResponseDto toListEventResponseDto(Event event);

	GetEventDetailsTicketTypesResponseDto toGetEventDetailsTicketTypesResponseDto(TicketType ticketType);

	GetEventDetailsResponseDto toGetEventDetailsResponseDto(Event event);

	UpdateTicketTypeRequest fromDto(UpdateTicketTypeRequestDto dto);

	UpdateEventRequest fromDto(UpdateEventRequestDto dto);

	UpdateTicketTypeResponseDto toUpdateTicketTypeRequestDto(TicketType ticketType);

	UpdateEventResponseDto toUpdateEventResponseDto(Event event);
	
	ListPublishedEventResponseDto toListPublishedEventResponseDto(Event event);

	GetPublishedEventDetailsTicketTypesResponseDto toGetPublishedEventDetailsTicketTypesResponseDto(TicketType ticketType);
	
	GetEventPublishedDetailsResponseDto toGetEventPublishedDetailsResponseDto(Event event);
}
