package com.zeynalabidinunlu.tickets.domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateEventRequest {

	private String name;

	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private String venue;
	private LocalDateTime salesStart;
	private LocalDateTime salesEnd;
	private List<CreateTicketTypeRequest> ticketTypes = new ArrayList<>();
	

}
