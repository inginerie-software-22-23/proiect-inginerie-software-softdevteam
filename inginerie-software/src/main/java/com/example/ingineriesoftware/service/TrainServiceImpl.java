package com.example.ingineriesoftware.service;

import com.example.ingineriesoftware.model.Train;
import com.example.ingineriesoftware.repository.TrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainServiceImpl implements TrainService {

    @Autowired
    TrainRepository trainRepository;
    @Override
    public void save(Train entity) {
        trainRepository.save(entity);
    }

    @Override
    public List<Train> findAll() {
        return (List<Train>) trainRepository.findAll();
    }

    @Override
    public Optional<Train> findById(Integer id) {
        return trainRepository.findById(id);
    }

    @Override
    public void delete(Train entity) {
        trainRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer id) {
        trainRepository.deleteById(id);
    }
}
