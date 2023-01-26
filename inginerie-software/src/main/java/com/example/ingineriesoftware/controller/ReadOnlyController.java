package com.example.ingineriesoftware.controller;

import javax.management.InstanceNotFoundException;
import java.util.List;

public interface ReadOnlyController<T> {
    List<T> findAll();
    T findById(Long id) throws InstanceNotFoundException;
}
