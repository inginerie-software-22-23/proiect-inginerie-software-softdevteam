package com.example.ingineriesoftware.controller;

import com.example.ingineriesoftware.model.UserDetails;
import com.example.ingineriesoftware.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.management.InstanceNotFoundException;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserDetailController implements CrudController<UserDetails> {

    @Autowired
    UserDetailsService userDetailsService;

    @Override
    @PostMapping("save")
    public void save(@RequestBody UserDetails entity) {
        userDetailsService.save(entity);
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    @GetMapping("getAll")
    public List<UserDetails> findAll() {
        return userDetailsService.findAll();
    }

    @Override
    public UserDetails findById(Long id) throws InstanceNotFoundException {
        return null;
    }
}
