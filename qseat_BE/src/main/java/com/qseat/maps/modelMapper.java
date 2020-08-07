package com.qseat.maps;

import com.qseat.domain.entities.Booking;
import com.qseat.domain.entities.Person;
import com.qseat.domain.entities.Station;
import com.qseat.resources.BookingResource;
import com.qseat.resources.PersonResource;
import com.qseat.resources.StationResource;
import org.mapstruct.Mapper;

@Mapper(componentModel="spring")
public interface modelMapper {
    PersonResource personToPersonResource(Person person);
    StationResource stationToStationResource(Station station);

   BookingResource bookingToBookingResource(Booking b);
   Booking bookingResourceToBooking (BookingResource b);

}
