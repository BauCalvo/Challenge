package com.challenge.Challenge.controller;


import com.challenge.Challenge.entities.Person;
import com.challenge.Challenge.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/api")
public class Controller {

    @Autowired
    PersonaRepository repository;


    @RequestMapping(value ="", method = RequestMethod.POST)
    public Person addPerson(@RequestBody Person person){
        return repository.insert(person);
    }
    @RequestMapping(value ="/name/{name}", method = RequestMethod.GET)
    public Person addPerson(@PathVariable(name = "name") String name){
        return repository.findByName(name);
    }
}
