package com.twitter.ticketissuesystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twitter.ticketissuesystem.models.Ticket;
import com.twitter.ticketissuesystem.services.TicketsService;

@RestController
@RequestMapping("/tickets")
public class TicketsController {

	@Autowired
	private TicketsService service;

	@GetMapping
	public List<Ticket> get() {
		return service.get();
	}

	@GetMapping("/{id}")
	public Ticket get(final @PathVariable("id") Long ticketId) {
		return service.get(ticketId);
	}

	@PostMapping
	public Ticket create(final @RequestBody Ticket ticket) {
		return service.create(ticket);
	}

	@PutMapping
	public Ticket update(final @RequestBody Ticket ticket) {
		return service.create(ticket);
	}

	@DeleteMapping("/{id}")
	public void delete(final @PathVariable("id") Long ticketId) {
		service.delete(ticketId);
	}

}
