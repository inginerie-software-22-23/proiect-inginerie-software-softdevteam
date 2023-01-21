package com.example.ingineriesoftware.repository;

import com.example.ingineriesoftware.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketRepository extends CrudRepository<Ticket, Integer> {
}
