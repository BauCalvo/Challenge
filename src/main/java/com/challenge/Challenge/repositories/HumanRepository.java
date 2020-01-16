package com.challenge.Challenge.repositories;

import com.challenge.Challenge.entities.Human;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HumanRepository extends MongoRepository<Human,String[]> {
     Human findByDna(String[] dna);
}
