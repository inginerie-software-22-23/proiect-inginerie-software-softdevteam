package com.example.ingineriesoftware.controller;

public interface CrudController<T> extends ReadOnlyController<T>{
    void save(T entity);
    void deleteById(Long id);
}
