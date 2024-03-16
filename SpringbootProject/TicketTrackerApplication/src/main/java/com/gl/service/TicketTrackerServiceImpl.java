package com.gl.service;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.dao.TicketTrackerDAO;
import com.gl.model.TicketTracker;

@Service
public class TicketTrackerServiceImpl implements TicketTrackerService{

	@Autowired
	TicketTrackerDAO dao;
	
	@Override
	public TicketTracker addTicketTracker(TicketTracker ticket) {
		
		return dao.save(ticket);
	}

	@Override
	public TicketTracker getTicketById(int id) {
		
		Optional<TicketTracker> optional=dao.findById(id);
		TicketTracker ticket=null;
		if(optional.isPresent()) {
			ticket=optional.get();
		}else {
			throw new RuntimeException("Employee not found for :"+id);
			
		}
		return ticket;
	}

	@Override
	public void updateTicketTracker(TicketTracker ticket) {
		
//		Optional<TicketTracker> optionalTIcket=dao.findById(id);
//		if(optionalTIcket.isPresent()) {	
//		TicketTracker existingTicket=optionalTIcket.get();
//		existingTicket.setTicketTitle(ticket.getTicketTitle());
//		existingTicket.setTicketDescription(ticket.getTicketDescription());
//		existingTicket.setTicketCreation(ticket.getTicketCreation());
//		dao.save(existingTicket);
		dao.save(ticket);
		}
		
	

	@Override
	public void deleteTicketById(int id) {
		
		dao.deleteById(id);
	}

	@Override
	public List<TicketTracker> getAllTickets() {
		
		return dao.findAll();
	}

}
