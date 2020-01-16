package com.challenge.Challenge.controller;


import com.challenge.Challenge.Service.HumanService;
import com.challenge.Challenge.Service.MutantService;
import com.challenge.Challenge.entities.Human;
import com.challenge.Challenge.entities.Mutant;
import com.challenge.Challenge.entities.Stat;
import com.challenge.Challenge.exceptions.NotMutantException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="")
public class Controller {

    @Autowired
    MutantService mutantService;
    @Autowired
    HumanService humanService;

    @RequestMapping(value ="/mutant", method = RequestMethod.POST)
    public void addMutant(@RequestBody Mutant mutant){
        if(mutantService.isMutant(mutant.getDna())) {
            if(mutantService.valdation(mutant.getDna())){
                mutantService.addMutant(mutant);
            }
        }
        else {

            if(humanService.valdation(mutant.getDna())){
                humanService.addHuman(new Human(mutant.getDna()));
            }
            throw new NotMutantException();
        }
    }

    @RequestMapping(value ="/stats", method = RequestMethod.GET)
    public Stat stats(){
        return humanService.getStats(mutantService.findAll().size());
    }

    @RequestMapping(value ="", method = RequestMethod.GET)
    public List<Mutant> seeAll(){

        return mutantService.findAll();
    }
    @RequestMapping(value ="/human", method = RequestMethod.GET)
    public List<Human> seeAllHuman(){
        return humanService.findAll();
    }



}
