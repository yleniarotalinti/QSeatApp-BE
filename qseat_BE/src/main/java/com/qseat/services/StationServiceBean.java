package com.qseat.services;

import com.qseat.domain.entities.Station;
import com.qseat.domain.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StationServiceBean implements StationService{

    @Autowired
    StationRepository repository;

    @Override
    public Iterable<Station> findAll() {
        return repository.findAll();
    }
}
