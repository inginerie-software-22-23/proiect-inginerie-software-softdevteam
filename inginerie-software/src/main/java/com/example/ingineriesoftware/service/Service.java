package com.example.ingineriesoftware.service;

import java.util.List;
import java.util.Optional;

public interface Service<T> {

    void save(T entity);

    List<T> findAll();
    Optional<T> findById(Integer id);

    void delete(T entity);
    void deleteById(Integer id);

}
