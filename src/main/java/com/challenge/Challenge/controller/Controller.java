package com.challenge.Challenge.controller;


import com.challenge.Challenge.Service.MutantService;
import com.challenge.Challenge.entities.Mutant;
import com.challenge.Challenge.exceptions.NotMutantException;
import com.challenge.Challenge.repositories.MutantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="")
public class Controller {

    @Autowired
    MutantService bo;

    @RequestMapping(value ="/mutant", method = RequestMethod.POST)
    public void addMutant(@RequestBody Mutant mutant){
        if(bo.isMutant(mutant.getDna())) {
            if(bo.valdation(mutant.getDna())){
                bo.addMutant(mutant);
            }
        }
        else {
            throw new NotMutantException();
        }
    }
    @RequestMapping(value ="", method = RequestMethod.GET)
    public List<Mutant> seeAll(){
        return bo.findAll();
    }


}
