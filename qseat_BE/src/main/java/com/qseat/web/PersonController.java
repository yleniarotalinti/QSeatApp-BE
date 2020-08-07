package com.qseat.web;

import com.qseat.domain.entities.Person;
import com.qseat.maps.modelMapper;
import com.qseat.resources.PersonResource;
import com.qseat.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/employees")
public class PersonController {

    @Autowired
    PersonService service ;

    @Autowired
    modelMapper mapper;

    //find all employers by nome and cognome
    @CrossOrigin(origins = "http://localhost:3000")
    @RequestMapping(method= RequestMethod.GET,
                    produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<PersonResource> getAll(@RequestParam(name="nome", required = false) String nome,
                                       @RequestParam(name="cognome", required = false) String cognome){
        List<Person> entities = service.findCurrentEmployeers();
        List<PersonResource> resources = new ArrayList<PersonResource>();
        for (Person p:entities){
            if (nome != null && cognome != null){
                if (p.getNome().compareTo(nome)==0 && p.getCognome().compareTo(cognome)==0){
                    resources.add(mapper.personToPersonResource(p));
                }
            } else {
                resources.add(mapper.personToPersonResource(p));
            }
        }
        return resources;
    }

    //find all employers by email
    @RequestMapping(method= RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE},
            params = "email")
    public PersonResource getAllbyEmail(@RequestParam(name="email", required = true) String email){
        Person entity = service.findByEmail(email);
        PersonResource resource = mapper.personToPersonResource(entity);
        return resource;
    }
}
