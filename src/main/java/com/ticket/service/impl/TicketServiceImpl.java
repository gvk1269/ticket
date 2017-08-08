package com.ticket.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ticket.service.Ticket;
import com.ticket.service.TicketService;
import com.ticket.service.repository.TicketServiceRepository;

@Service
public class TicketServiceImpl implements TicketService {
	
	@Autowired TicketServiceRepository repository;

	@Override
	public Ticket reserveTicket(String firstName,String lastName) {
		Ticket ticket = new Ticket();
		ticket.setFirstName(firstName);
		ticket.setLastName(lastName);
		repository.save(ticket);
		return ticket;
	}

	@Override
	public Ticket getTicket(Long id) {
		return repository.findOne(id);
	}

	@Override
	public Ticket searchByLastName(String lastName) {
		return repository.findByLastName(lastName);
	}

}
