package com.qseat.services;

import com.qseat.domain.entities.Person;
import com.qseat.domain.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceBean implements PersonService{

    @Autowired
    PersonRepository repository;

    @Override
    public Iterable<Person> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Person> findCurrentEmployeers() {
        Iterable<Person> entitiesIterable = repository.findAll();
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
        Person p = repository.findbyEmail(email);
        return p ;
    }

}
