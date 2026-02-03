package com.zeynalabidinunlu.tickets.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.zeynalabidinunlu.tickets.domain.entities.Event;
import com.zeynalabidinunlu.tickets.domain.entities.EventStatusEnum;

public interface EventRepository extends JpaRepository<Event, UUID> {

	Page<Event> findByOrganizerId(UUID id, Pageable pageable);

	Optional<Event> findByIdAndOrganizerId(UUID id, UUID organizerId);

	Page<Event> findByStatus(EventStatusEnum status, Pageable pageable);
}
