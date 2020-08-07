package com.qseat.domain.repositories;

import com.qseat.domain.entities.Station;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StationRepository extends PagingAndSortingRepository<Station, String> {

    @Query("SELECT DISTINCT s.piano FROM Station s")
    List<String> findByLevels();

    @Query("SELECT s FROM Station s WHERE s.piano=:piano")
    List<Station> findStationsByLevel(@Param("piano") String piano);
}
