package com.example.ingineriesoftware.service;

import com.example.ingineriesoftware.model.Ticket;
import com.example.ingineriesoftware.repository.TicketRepository;
import com.example.ingineriesoftware.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TicketServiceImpl implements TicketService{

    @Autowired
    TicketRepository ticketRepository;
    @Override
    public void save(Ticket entity) {
        ticketRepository.save(entity);
    }

    @Override
    public List<Ticket> findAll() {
        return (List<Ticket>) ticketRepository.findAll();
    }

    @Override
    public Optional<Ticket> findById(Integer id) {
        return ticketRepository.findById(id);
    }

    @Override
    public void delete(Ticket entity) {
        ticketRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer id) {
        ticketRepository.deleteById(id);
    }
}
