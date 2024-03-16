package com.gl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.gl.model.TicketTracker;
import com.gl.service.TicketTrackerService;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {

	@Autowired
	TicketTrackerService service;

	@GetMapping("/")
	public String showHome() {
		return "index";
	}

	@GetMapping("/tickets")
	public String showAllTickets(Model model) {
		model.addAttribute("ticket", service.getAllTickets());
		return "tickets";
	}

	//CREATE
	@GetMapping("/add")
	public String showAdd(Model model) {
		model.addAttribute("ticket", new TicketTracker());
		return "add";
	}

	@PostMapping("/addTicket")
	public String showAddTicket(Model model, @ModelAttribute("ticket") TicketTracker newTicket) {
		model.addAttribute("ticket", service.addTicketTracker(newTicket));
		return "redirect:/tickets";
	}

	// DELETE
	@PostMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		service.deleteTicketById(id);
		return "redirect:/tickets";
	}

	//UPDATE
	@GetMapping("/update/{id}")
	public String showUpdate(@PathVariable("id") int id,Model model) {

		TicketTracker ticket=service.getTicketById(id);
		model.addAttribute("ticket", ticket);
		return "update";

	}

	@PostMapping("/updateTicket/{id}")
	public String update(@PathVariable("id") int id,@ModelAttribute("ticket") TicketTracker ticket) {		
		service.updateTicketTracker(ticket);
	    return "redirect:/tickets";
	}
	
	//SEARCH
	@GetMapping("/search/{id}")
	public String showSearch(Model model, @RequestParam("id") int id) {
		
		model.addAttribute("ticket", service.getTicketById(id));
		return  "search";
	}
	
	@GetMapping("/searchTicket")
	public String search(@ModelAttribute("ticket") TicketTracker ticket,Model model) {
		
		model.addAttribute("ticket", ticket);
		return "redirect:/tickets";
	}
	
	//VIEW
	@GetMapping("/view/{id}")
	public String showView(@PathVariable int id,Model model ) {	 
		model.addAttribute("ticket", service.getTicketById(id));
		return "view";
	}

	

}