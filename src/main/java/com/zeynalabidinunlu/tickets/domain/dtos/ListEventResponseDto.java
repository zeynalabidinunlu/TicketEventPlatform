package com.zeynalabidinunlu.tickets.domain.dtos;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.ArrayList;
import java.util.List;

import com.zeynalabidinunlu.tickets.domain.entities.EventStatusEnum;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListEventResponseDto {

	private UUID id;
	private String name;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private String venue;
	private LocalDateTime salesStart;
	private LocalDateTime salesEnd;
	private EventStatusEnum status;
	private List<ListEventTicketTypeResponseDto> ticketTypes = new ArrayList<>();
	
}
