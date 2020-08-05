package com.qseat.services;


import com.qseat.domain.entities.Booking;

public interface BookingService {
    Iterable<Booking> findAll();
    Booking create(Booking booking);
    void delete(Booking booking);
    Booking findByIds(String data_prenotazione, String sede, String postazione_scrivania);
}
