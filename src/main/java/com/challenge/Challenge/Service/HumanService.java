package com.challenge.Challenge.Service;

import com.challenge.Challenge.entities.Human;
import com.challenge.Challenge.entities.Mutant;
import com.challenge.Challenge.entities.Stat;
import com.challenge.Challenge.repositories.HumanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HumanService {
    @Autowired
    HumanRepository repository;

    public void addHuman(Human human){
        repository.insert(human);
    }

    public Stat getStats(Integer mutants){
        Integer humans = findAll().size();
        Float ratio = ((float)mutants/(mutants+humans));
        return new Stat(mutants,findAll().size(),ratio);
    }

    public Human findByDna(String[] dna){
        return repository.findByDna(dna);
    }
    public List<Human> findAll(){
        return repository.findAll();
    }
    public boolean valdation(String[] dna){
        if (repository.findByDna(dna) == null){
            return true;
        }
        return false;
    }
}
