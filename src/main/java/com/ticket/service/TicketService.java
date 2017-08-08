package com.ticket.service;

public interface TicketService {
	
	Ticket reserveTicket(String firstName,String lastName);
	Ticket getTicket(Long id);
	Ticket searchByLastName(String lastName);
}
