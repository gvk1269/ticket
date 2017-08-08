package com.ticket.service;

public class Ticket {
	private Long ticketId;
	private String firstName;
	private String lastName;

	
	public Ticket() {
		super();
	}


	public Ticket(Long ticketId, String firstName, String lastName) {
		super();
		this.ticketId = ticketId;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	/**
	 * @return the ticketId
	 */
	public Long getTicketId() {
		return ticketId;
	}


	/**
	 * @param ticketId the ticketId to set
	 */
	public void setTicketId(Long ticketId) {
		this.ticketId = ticketId;
	}


	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
}
