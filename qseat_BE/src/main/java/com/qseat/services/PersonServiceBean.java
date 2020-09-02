package com.qseat.services;

import com.qseat.domain.entities.Person;
import com.qseat.domain.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceBean implements PersonService{

    @Autowired
    PersonRepository personRepository;

    @Override
    public Iterable<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public List<Person> findCurrentEmployeers() {
        Iterable<Person> entitiesIterable = personRepository.findAll();
        List<Person> entities = new ArrayList<Person>();
        for (Person p:entitiesIterable){
            if (p.getData_uscita() == null ){
                entities.add(p);
            }
        }
        return entities;
    }

    @Override
    public Person findByEmail(String email) {
        Person p = personRepository.findbyEmail(email);
        return p ;
    }

}
