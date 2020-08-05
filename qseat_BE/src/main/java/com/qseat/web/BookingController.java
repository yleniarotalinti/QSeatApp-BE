package com.qseat.web;

import com.qseat.domain.entities.Booking;
import com.qseat.domain.entities.Person;
import com.qseat.maps.modelMapper;
import com.qseat.resources.BookingResource;
import com.qseat.resources.PersonResource;
import com.qseat.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
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

    @Autowired
    modelMapper mapper;

    //filtraggio prenotazioni
    @RequestMapping(method= RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<BookingResource> getAll(@RequestParam(name="data", required = false) String data,
                                        @RequestParam(name="sede", required = false) String sede,
                                        @RequestParam(name="piano", required = false) String piano,
                                        @RequestParam(name="nome", required = false) String nome,
                                        @RequestParam(name="cognome", required = false) String cognome){
        Iterable<Booking> entities = service.findAll();
        List<BookingResource> resources = new ArrayList<BookingResource>();
        for (Booking b:entities){
            String nomeRisorsa = b.getRisorsa().split(" ")[0];
            String cognomeRisorsa = b.getRisorsa().split(" ")[1];
            if (data !=null && sede !=null && piano!=null && nome != null && cognome != null){
                if (b.getData_prenotazione().compareTo(data)==0 &&
                    b.getSede().compareTo(sede)==0 &&
                    b.getPostazione_scrivania().compareTo(piano)==0 &&
                    nomeRisorsa.compareTo(nome)==0 &&
                    cognomeRisorsa.compareTo(cognome)==0){
                    resources.add(mapper.bookingToBookingResource(b));
                }
            } else {
                resources.add(mapper.bookingToBookingResource(b));
            }
        }
        return resources;
    }

    //POST: aggiunta di una nuova prenotazione
    @RequestMapping(method=RequestMethod.POST,
            consumes=MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public BookingResource post(@RequestBody BookingResource resource) {
        Booking entity = mapper.bookingResourceToBooking(resource);
        entity = service.create(entity);
        return mapper.bookingToBookingResource(entity);
    }

    //DELETE: cancellazione di una prenotazione
    @RequestMapping(method=RequestMethod.DELETE,
            produces=MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> delete(@RequestParam(name="data", required = false) String data,
                                       @RequestParam(name="sede", required = false) String sede,
                                       @RequestParam(name="piano", required = false) String piano) {
        Booking b = service.findByIds(data, sede, piano);
        service.delete(b);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
