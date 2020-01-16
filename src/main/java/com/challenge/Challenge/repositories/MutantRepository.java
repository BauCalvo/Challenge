package com.challenge.Challenge.repositories;

import com.challenge.Challenge.entities.Mutant;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MutantRepository extends MongoRepository<Mutant,String[]> {
    public Mutant findByDna(String[] dna);
}
