package com.gl.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class TicketTracker {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String ticketTitle;
	String ticketDescription;
	LocalDate ticketCreation;

}
