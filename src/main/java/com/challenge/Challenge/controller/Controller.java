package com.challenge.Challenge.controller;


import com.challenge.Challenge.Service.MutantService;
import com.challenge.Challenge.entities.Mutant;
import com.challenge.Challenge.exceptions.NotMutantException;
import com.challenge.Challenge.repositories.MutantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/mutant")
public class Controller {

    @Autowired
    MutantService bo;


    @RequestMapping(value ="", method = RequestMethod.POST)
    public void addMutant(@RequestBody Mutant mutant){
        if(bo.isMutant(mutant.getDna())) {
            bo.addMutant(mutant);
        }
        else {
            throw new NotMutantException();
        }
    }


}
