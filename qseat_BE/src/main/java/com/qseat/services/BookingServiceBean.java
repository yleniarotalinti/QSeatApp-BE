package com.qseat.services;

import com.qseat.domain.entities.Booking;
import com.qseat.domain.entities.Station;
import com.qseat.domain.repositories.BookingRepository;
import com.qseat.domain.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public Booking findByIds(String data_prenotazione, String sede, String postazione_scrivania) {
        Iterable<Booking> entitiesIterable = repository.findAll();
        Booking entity = new Booking();
        for (Booking b:entitiesIterable){
            if (b.getData_prenotazione().compareTo(data_prenotazione)==0 &&
               b.getPostazione_scrivania().compareTo(postazione_scrivania)==0 &&
                b.getSede().compareTo(sede)==0){
                entity = b;
            } else {
                //throw new Exception (no prenotazione con quei valori)
            }
        }
        return entity;
    }
}
