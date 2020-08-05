package com.qseat;

import com.qseat.domain.entities.Booking;
import com.qseat.domain.entities.Person;
import com.qseat.domain.entities.Station;
import com.qseat.domain.repositories.BookingRepository;
import com.qseat.domain.repositories.PersonRepository;
import com.qseat.domain.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmbededDBConfig {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    StationRepository stationRepository;

    @Autowired
    BookingRepository bookingRepository;

    @Bean
    Boolean dbInitialize(){
        createPeople();
        createStations();
        createBookings();
        return Boolean.TRUE;
    }

    private void createPeople(){
        personRepository.save(new Person("ylenia.rotalinti@quantyca.it", "Ylenia", "Rotalinti", "2020-07-01"));
        personRepository.save(new Person("marta.brunetti@quantyca.it", "Marta", "Brunetti", "2020-07-01"));
        personRepository.save(new Person("matteo.colella@quantyca.it", "Matteo", "Colella", "2020-07-01"));
        personRepository.save(new Person("matteo.borghi@quantyca.it", "Matteo", "Borghi", "2020-01-01", "2020-06-01"));

    }

    private void createStations(){
        stationRepository.save(new Station("P1-1", true, "Delivery","Corso Milano", "Primo"));
        stationRepository.save(new Station("P1-2", true, "Delivery","Corso Milano", "Primo"));
    }

    private void createBookings(){
        bookingRepository.save(new Booking("2020-05-18", "Corso Milano", "P1-1", "Matteo Colella"));
        bookingRepository.save(new Booking("2020-05-21", "Corso Milano", "P1-2", "Ylenia Rotalinti"));
    }
}
