package com.example.ingineriesoftware.controller;


import com.example.ingineriesoftware.model.Ticket;
import com.example.ingineriesoftware.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.management.InstanceNotFoundException;
import java.util.List;

@RestController
@RequestMapping("ticket")
public class TicketController implements CrudController<Ticket> {

    @Autowired
    TicketService ticketService;

    @Override
    @PostMapping("/save")
    public void save(@RequestBody Ticket entity) {
        ticketService.save(entity);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    @GetMapping("getAll")
    public List<Ticket> findAll() {
        return ticketService.findAll();
    }

    @Override
    public Ticket findById(Long id) throws InstanceNotFoundException {
        return null;
    }
}
