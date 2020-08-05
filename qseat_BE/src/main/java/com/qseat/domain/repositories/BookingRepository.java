package com.qseat.domain.repositories;

import com.qseat.domain.entities.Booking;
import com.qseat.domain.entities.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookingRepository extends PagingAndSortingRepository<Booking, String> {

    @Query("SELECT b FROM Booking b WHERE (:data_prenotazione is null or b.data_prenotazione = :data_prenotazione)"
            +"and (:sede is null or b.sede = :sede)"
            + "and (:postazione_scrivania is null or b.postazione_scrivania = :postazione_scrivania)"
            + "and (:risorsa is null or b.risorsa = :risorsa)")
    List<Booking> findbyFilters(@Param("data_prenotazione") String data_prenotazione,
                                @Param("sede") String sede,
                                @Param("postazione_scrivania") String postazione_scrivania,
                                @Param("risorsa") String risorsa);
}
