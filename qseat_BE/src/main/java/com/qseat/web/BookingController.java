package com.qseat.web;

import com.qseat.domain.entities.Booking;
import com.qseat.maps.modelMapper;
import com.qseat.maps.modelMapper1;
import com.qseat.resources.BookingResource;
import com.qseat.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/bookingHistory")
public class BookingController {

    @Autowired
    BookingService service;

    //@Autowired
    modelMapper1 mapper=new modelMapper1();

    //filtraggio prenotazioni
    @RequestMapping(method= RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<BookingResource> getAll(@RequestParam(name="data", required = false) String data,
                                        @RequestParam(name="sede", required = false) String sede,
                                        @RequestParam(name="postazione_scrivania", required = false) String postazione_scrivania,
                                        @RequestParam(name="risorsa", required = false) String risorsa){
        List<Booking> entities = service.findByIds(data,sede,postazione_scrivania,risorsa);
        List<BookingResource> resources = new ArrayList<BookingResource>();
        for (Booking b:entities){
                    resources.add(mapper.bookingToBookingResource(b));
        }
        return resources;
    }

    //POST: aggiunta di una nuova prenotazione
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method=RequestMethod.POST,
            consumes=MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public BookingResource post(@RequestBody BookingResource resource) {
        Booking entity = mapper.bookingResourceToBooking(resource);
        entity = service.create(entity);
        return mapper.bookingToBookingResource(entity);
    }

    //DELETE: cancellazione di una prenotazione
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method=RequestMethod.DELETE,
            produces=MediaType.APPLICATION_JSON_VALUE,
            params = { "data_prenotazione", "sede","postazione_scrivania", "risorsa"})
    public ResponseEntity<Void> delete(@RequestParam(name="data_prenotazione", required = true) String data_prenotazione,
                                       @RequestParam(name="sede", required = true) String sede,
                                       @RequestParam(name="postazione_scrivania", required = true) String postazione_scrivania,
                                       @RequestParam(name="risorsa", required = true) String risorsa) {
        List<Booking> bookings = service.findByIds(data_prenotazione, sede, postazione_scrivania, risorsa);
        Booking b = bookings.get(0); //avrò solamente una prenotazione con quei specifici campi
        service.delete(b);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}
