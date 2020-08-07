package com.qseat.web;

import com.qseat.domain.entities.Person;
import com.qseat.domain.entities.Station;
import com.qseat.maps.modelMapper;
import com.qseat.resources.PersonResource;
import com.qseat.resources.StationResource;
import com.qseat.services.PersonService;
import com.qseat.services.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/stations")
public class StationController {
    @Autowired
    StationService service ;

    @Autowired
    modelMapper mapper;

    //getter delle postazioni
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method= RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<StationResource> getAll(){
        Iterable<Station> entities = service.findAll();
        List<StationResource> resources = new ArrayList<StationResource>();
        for (Station s:entities){
                resources.add(mapper.stationToStationResource(s));
        }
        return resources;
    }

    //numero di piani disponibili
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(value="/levels",
            method= RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<String>getLevels(){
        List<String> levels = service.findLevels();
        return levels;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method= RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE},
            params = "piano")
    public List<StationResource> getStationsByLevel(@Param("piano") String piano){
        List<Station> entities = service.findStationsByLevel(piano);
        List<StationResource> resources = new ArrayList<StationResource>();
        for (Station s:entities){
            resources.add(mapper.stationToStationResource(s));
        }
        return resources;
    }



}
