package com.qseat.maps;

import com.qseat.domain.entities.Booking;
import com.qseat.domain.entities.Person;
import com.qseat.domain.entities.Station;
import com.qseat.resources.BookingResource;
import com.qseat.resources.PersonResource;
import com.qseat.resources.StationResource;

public class modelMapper1 {

    public PersonResource personToPersonResource(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonResource personResource = new PersonResource();

        personResource.setEmail( person.getEmail() );
        personResource.setNome_breve( person.getNome_breve() );
        personResource.setNome_esteso( person.getNome_esteso() );
        personResource.setNome( person.getNome() );
        personResource.setCognome( person.getCognome() );
        personResource.setRuolo( person.getRuolo() );
        personResource.setData_assunzione( person.getData_assunzione() );
        personResource.setData_uscita( person.getData_uscita() );
        personResource.setInsert_timestamp( person.getInsert_timestamp() );
        personResource.setBookings(person.getBookings());

        return personResource;
    }


    public StationResource stationToStationResource(Station station) {
        if ( station == null ) {
            return null;
        }

        StationResource stationResource = new StationResource();

        stationResource.setId_postazione( station.getId_postazione() );
        stationResource.setFlag_prenotabile( station.isFlag_prenotabile() );
        stationResource.setDestinazione( station.getDestinazione() );
        stationResource.setSede( station.getSede() );
        stationResource.setPiano( station.getPiano() );
        stationResource.setBookings(station.getBookings());

        return stationResource;
    }


    public BookingResource bookingToBookingResource(Booking b) {
        if ( b == null ) {
            return null;
        }

        BookingResource bookingResource = new BookingResource();

        bookingResource.setData_prenotazione( b.getData_prenotazione() );
        bookingResource.setSede( b.getSede() );
        bookingResource.setPostazione(b.getStation());
        bookingResource.setRisorsa(b.getPerson());

        return bookingResource;
    }

    public Booking bookingResourceToBooking(BookingResource b) {
        if ( b == null ) {
            return null;
        }

        Booking booking = new Booking();

        booking.setData_prenotazione( b.getData_prenotazione() );
        booking.setSede( b.getSede() );
        booking.setPerson(b.getRisorsa());
        booking.setStation(b.getPostazione());

        return booking;
    }
}
