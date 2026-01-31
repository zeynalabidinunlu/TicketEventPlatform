package com.zeynalabidinunlu.tickets.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zeynalabidinunlu.tickets.domain.entities.Event;

public interface EventRepository extends JpaRepository<Event, UUID> {

	
}
