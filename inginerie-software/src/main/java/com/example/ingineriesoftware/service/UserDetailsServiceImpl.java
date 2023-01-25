package com.example.ingineriesoftware.service;

import com.example.ingineriesoftware.model.UserDetails;
import com.example.ingineriesoftware.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

    @Autowired
    UserDetailsRepository userDetailsRepository;

    @Override
    public void save(UserDetails entity) {
        userDetailsRepository.save(entity);
    }

    @Override
    public List<UserDetails> findAll() {
        return (List<UserDetails>) userDetailsRepository.findAll();
    }

    @Override
    public Optional<UserDetails> findById(Integer id) {
        return userDetailsRepository.findById(id);
    }

    @Override
    public void delete(UserDetails entity) {
        userDetailsRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer id) {
        userDetailsRepository.deleteById(id);

    }
}
