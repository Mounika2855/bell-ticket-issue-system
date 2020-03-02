package com.twitter.ticketissuesystem.repositories;

import org.springframework.data.repository.CrudRepository;

import com.twitter.ticketissuesystem.models.Ticket;

public interface TicketsRepository extends CrudRepository<Ticket, Long> {

}
