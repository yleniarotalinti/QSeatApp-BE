package com.qseat.domain.repositories;

import com.qseat.domain.entities.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface PersonRepository extends PagingAndSortingRepository<Person, String> {

    @Query("SELECT a FROM Person a WHERE a.email =:email")
    Person findbyEmail(@Param("email") String email);

}
