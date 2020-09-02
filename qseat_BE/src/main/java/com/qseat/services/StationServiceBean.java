package com.qseat.services;

import com.qseat.domain.entities.Station;
import com.qseat.domain.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationServiceBean implements StationService{

    @Autowired
    StationRepository stationRepository;

    @Override
    public Iterable<Station> findAll() {
        return stationRepository.findAll();
    }

    @Override
    public List<String> findLevels() {
        return stationRepository.findByLevels();
    }

    @Override
    public List<Station> findStationsByLevel(String piano) {
        return stationRepository.findStationsByLevel(piano);
    }
}
