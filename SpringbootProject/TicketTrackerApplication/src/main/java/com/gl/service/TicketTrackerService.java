package com.gl.service;

import java.util.List;

import com.gl.model.TicketTracker;

public interface TicketTrackerService {

	public TicketTracker addTicketTracker(TicketTracker ticket);
	
	public TicketTracker getTicketById(int id);
	
	public void updateTicketTracker(TicketTracker ticket);
	
	public void deleteTicketById(int id);
	
	public List<TicketTracker> getAllTickets();
}
