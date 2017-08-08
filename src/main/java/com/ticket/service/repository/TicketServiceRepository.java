package com.ticket.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ticket.service.Ticket;

public interface TicketServiceRepository extends JpaRepository<Ticket, Long> {
	
	int findAvailableTickets();
	Ticket findByLastName(String lastName); // In actual scenario they will return multiple records

}
