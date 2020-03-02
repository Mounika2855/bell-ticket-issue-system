package com.twitter.ticketissuesystem.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twitter.ticketissuesystem.models.Ticket;
import com.twitter.ticketissuesystem.repositories.TicketsRepository;

@Service
public class TicketsService {

	@Autowired
	private TicketsRepository repository;

	public List<Ticket> get() {
		final List<Ticket> tickets = new ArrayList<Ticket>();
		for (Ticket ticket : repository.findAll()) {
			tickets.add(ticket);
		}
		return tickets;
	}

	public Ticket get(final Long ticketId) {
		return repository.findById(ticketId).get();
	}

	public Ticket create(final Ticket ticket) {
		return repository.save(ticket);
	}

	public Ticket update(final Ticket ticket) {
		return repository.save(ticket);
	}

	public void delete(final Long ticketId) {
		repository.deleteById(ticketId);
	}

}
