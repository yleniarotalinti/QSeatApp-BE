package com.qseat.services;

import com.qseat.domain.entities.Station;
import com.qseat.domain.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationServiceBean implements StationService{

    @Autowired
    StationRepository repository;

    @Override
    public Iterable<Station> findAll() {
        return repository.findAll();
    }

    @Override
    public List<String> findLevels() {
        return repository.findByLevels();
    }

    @Override
    public List<Station> findStationsByLevel(String piano) {
        return repository.findStationsByLevel(piano);
    }
}
