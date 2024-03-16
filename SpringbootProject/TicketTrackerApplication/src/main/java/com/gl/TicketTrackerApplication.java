package com.gl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gl.dao.TicketTrackerDAO;
import com.gl.model.TicketTracker;

@SpringBootApplication
public class TicketTrackerApplication  {

	@Autowired
	TicketTrackerDAO dao;
	public static void main(String[] args) {
		SpringApplication.run(TicketTrackerApplication.class, args);
	}
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		//dao.save(new TicketTracker(102, "ticket1", "bnvhfihfwilfhb", LocalDate.now()));
//     //TicketTracker tt=new TicketTracker();
//    //  System.out.println(dao.findById(2));
////	dao.deleteById(2);
////	System.out.println(dao.findAll());
//		
//	}

	
}
