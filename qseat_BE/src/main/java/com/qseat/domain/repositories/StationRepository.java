package com.qseat.domain.repositories;

import com.qseat.domain.entities.Station;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StationRepository extends PagingAndSortingRepository<Station, String> {
}
