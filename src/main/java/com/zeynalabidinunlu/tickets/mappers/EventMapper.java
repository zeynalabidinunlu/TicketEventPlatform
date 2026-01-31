package com.zeynalabidinunlu.tickets.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import com.zeynalabidinunlu.tickets.domain.CreateEventRequest;
import com.zeynalabidinunlu.tickets.domain.CreateTicketTypeRequest;
import com.zeynalabidinunlu.tickets.domain.dtos.CreateEventRequestDto;
import com.zeynalabidinunlu.tickets.domain.dtos.CreateEventResponseDto;
import com.zeynalabidinunlu.tickets.domain.dtos.CreateTicketTypeRequestDto;
import com.zeynalabidinunlu.tickets.domain.entities.Event;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {

	CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto);

	CreateEventRequest fromDto(CreateEventRequestDto dto);

	CreateEventResponseDto toDto(Event event);
}
