package com.qseat.services;


import com.qseat.domain.entities.Booking;

import java.util.List;

public interface BookingService {
    Iterable<Booking> findAll();
    Booking create(Booking booking);
    void delete(Booking booking);
    List<Booking> findByIds(String data_prenotazione, String sede, String postazione_scrivania, String risorsa);

/*
    List<BookingStations> findAvailability(String piano, String data);
*/
}
