package com.qseat.services;

import com.qseat.domain.entities.Station;

public interface StationService {
    Iterable<Station> findAll();
}
