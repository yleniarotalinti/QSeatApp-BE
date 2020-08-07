package com.qseat.services;

import com.qseat.domain.entities.Booking;
import com.qseat.domain.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceBean implements BookingService{

    @Autowired
    BookingRepository repository;

    @Override
    public Iterable<Booking> findAll() {
        return repository.findAll();
    }

    @Override
    public Booking create(Booking booking) {
        return repository.save(booking);
    }

    @Override
    public void delete(Booking booking) {
        repository.delete(booking);
    }

    @Override
    public List<Booking> findByIds(String data_prenotazione, String sede, String postazione_scrivania, String risorsa) {
        List<Booking> entities = repository.findbyFilters(data_prenotazione, sede, postazione_scrivania, risorsa);
        return entities;
    }

}
