package com.challenge.Challenge.repositories;

import com.challenge.Challenge.entities.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonaRepository extends MongoRepository<Person,String> {
    public Person findByName(String name);
}
