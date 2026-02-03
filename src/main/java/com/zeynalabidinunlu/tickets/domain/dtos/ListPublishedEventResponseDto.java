
package com.zeynalabidinunlu.tickets.domain.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListPublishedEventResponseDto {
	
	private UUID id;
	private String name;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private String venue;
	
}
