package com.gl.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.model.TicketTracker;

public interface TicketTrackerDAO extends JpaRepository<TicketTracker, Integer>{

}
