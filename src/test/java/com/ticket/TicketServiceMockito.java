package com.ticket;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.ticket.service.Ticket;
import com.ticket.service.TicketService;
import com.ticket.service.impl.TicketServiceImpl;
import com.ticket.service.repository.TicketServiceRepository;

@RunWith(MockitoJUnitRunner.class)
public class TicketServiceMockito {
	
	@Mock private Ticket ticket;
	@Mock private TicketServiceRepository repository;
	
	@InjectMocks private TicketService service =  new TicketServiceImpl(); 
	
	@Before
	public void setUp(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void MockTicketObjectCreationNotNull(){
		assertNotNull(ticket);
	}
	
	@Test
	public void MockTicketServiceRepositoryObjectCreationNotNull(){
		assertNotNull(repository);
	}
	@Test
	public void MockTicketObjectReturningNullObject(){
		Ticket ticket = null;
		when(service.getTicket(new Long(100))).thenReturn(ticket);
		assertNull(service.getTicket(new Long(100)));
		assertNull(service.getTicket(new Long(101)));
	}
	@Test
	public void MockTicketObjectReturningSameObject(){
		Ticket ticket = new Ticket(new Long(100),"Venkata","Kishore");
		when(service.getTicket(new Long(100))).thenReturn(ticket);
		assertEquals(ticket, service.getTicket(new Long(100)));
	}

	@Test
	public void MockTicketObjectCheckingForOtherTicketId(){
		Ticket ticket = new Ticket(new Long(100),"Venkata","Kishore");
		assertNotEquals(ticket, service.getTicket(new Long(101)));
	}
	
	@Test
	public void MockTicketObjectFindByLastNameReturnNull(){
		Ticket ticket = new Ticket(new Long(100),"Venkata","Kishore");
		assertNotEquals(ticket, service.searchByLastName("Venkata"));
	}
	
	@Test
	public void MockTicketObjectFindByLastNameReturnObject(){
		Ticket ticket = new Ticket(new Long(100),"Venkata","Kishore");
		when(service.searchByLastName("Kishore")).thenReturn(ticket);
		assertEquals(ticket, service.searchByLastName("Kishore"));
	}

}
