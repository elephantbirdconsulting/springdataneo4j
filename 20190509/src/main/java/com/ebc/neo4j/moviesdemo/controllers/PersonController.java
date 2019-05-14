package com.ebc.neo4j.moviesdemo.controllers;

import com.ebc.neo4j.moviesdemo.domains.Person;
import com.ebc.neo4j.moviesdemo.services.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/person")
public class PersonController {

    // this is what we are working with here
    private final PersonService mPersonService;

    // and the constructor sets it up
    public PersonController(PersonService aPersonService) {
        this.mPersonService = aPersonService;
    }

    @GetMapping("/byid")
    public Person findByUniqueConstraint(@RequestParam(value = "id", required = true) Long aId) {
        return mPersonService.findByUniqueConstraint(aId);
    }

    @GetMapping("/byname")
    public Person findByName(@RequestParam(value = "name", required = true) String aName) {
        return mPersonService.findByName(aName);
    }

    @GetMapping("/bynamelike")
    public Collection<Person> findByNameLike(@RequestParam(value = "name", required = true) String aName) {
        return mPersonService.findByNameLike(aName);
    }

    @GetMapping("/getabunch")
    public Collection<Person> getabunch(@RequestParam(value = "skip",required = false) Integer aSkip, @RequestParam(value = "limit",required = false) Integer aLimit) {
        return mPersonService.getabunch(aSkip == null ? 10 : aSkip, aLimit == null ? 100 : aLimit);
    }
}
