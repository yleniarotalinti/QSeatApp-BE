package com.qseat.domain.repositories;

import com.qseat.domain.entities.Booking;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BookingRepository extends PagingAndSortingRepository<Booking, String> {

    @Query("SELECT b FROM Booking b WHERE (:data_prenotazione is null or b.data_prenotazione = :data_prenotazione)"
            +"and (:sede is null or b.sede = :sede)"
            + "and (:postazione_scrivania is null or b.station.id_postazione = :postazione_scrivania)"
            + "and (:risorsa is null or b.person.email = :risorsa)")
    List<Booking> findbyFilters(@Param("data_prenotazione") String data_prenotazione,
                                @Param("sede") String sede,
                                @Param("postazione_scrivania") String postazione_scrivania,
                                @Param("risorsa") String risorsa);


    //@Query("SELECT b.postazione_scrivania, s.piano, b.data_prenotazione, b.risorsa FROM Booking b LEFT JOIN Station s ON b.postazione_scrivania=s.id_postazione WHERE (s.flag_prenotabile=true)and(:piano=s.piano)and (:data=b.data_prenotazione)")
    //List<BookingStations> findAvailability(@Param("piano") String piano,
    //                                      @Param("data") String data);

}
