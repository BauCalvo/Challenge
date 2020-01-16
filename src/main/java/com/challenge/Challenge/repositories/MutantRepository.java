package com.challenge.Challenge.repositories;

import com.challenge.Challenge.entities.Mutant;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface MutantRepository extends MongoRepository<Mutant,String[]> {
     Mutant findByDna(String[] dna);
}
