package com.example.ingineriesoftware.controller;

import com.example.ingineriesoftware.model.Train;
import com.example.ingineriesoftware.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.management.InstanceNotFoundException;
import java.util.List;

@RestController
@RequestMapping("train")
public class TrainController implements CrudController<Train>{

    @Autowired
    TrainService trainService;

    public TrainController() {
    }

    @Override
    @PostMapping("/save")
    public void save(@RequestBody Train entity) {
        trainService.save(entity);

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    @GetMapping("getAll")
    public List<Train> findAll() {
        return trainService.findAll();
    }

    @Override
    public Train findById(Long id) throws InstanceNotFoundException {
        return null;
    }
}
