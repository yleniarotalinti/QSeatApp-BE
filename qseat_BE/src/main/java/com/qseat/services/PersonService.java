package com.qseat.services;

import com.qseat.domain.entities.Person;

import java.util.List;

public interface PersonService {
    Iterable<Person> findAll();
    List<Person> findCurrentEmployeers();
}
