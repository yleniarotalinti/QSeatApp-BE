package com.qseat.services;

import com.qseat.domain.entities.Station;

import java.util.List;

public interface StationService {
    Iterable<Station> findAll();
    List<String> findLevels();
    List<Station>findStationsByLevel(String piano);
}
