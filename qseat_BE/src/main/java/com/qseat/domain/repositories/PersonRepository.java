package com.qseat.domain.repositories;

import com.qseat.domain.entities.Person;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PersonRepository extends PagingAndSortingRepository<Person, String> {
}
