package com.ebc.neo4j.moviesdemo.services;

import com.ebc.neo4j.moviesdemo.domains.Person;
import com.ebc.neo4j.moviesdemo.repositories.PersonRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class PersonService {
    // not using this, so I'm not having it ...
    // private final static Logger mLog = LoggerFactory.getLogger(MovieService.class);

    // this is what we're working with here
    private final PersonRepository mPersonRepository;

    // and the constructor sets it up
    public PersonService(PersonRepository aPersonRepository) {
        this.mPersonRepository = aPersonRepository;
    }

    @Transactional(readOnly = true)
    public Person findByUniqueConstraint(Long aId) {
        Person vResult = mPersonRepository.findByUniqueConstraint(aId);
        return vResult;
    }

    @Transactional(readOnly = true)
    public Person findByName(String aName) {
        Person vResult = mPersonRepository.findByName(aName);
        return vResult;
    }

    @Transactional(readOnly = true)
    public Collection<Person> findByNameLike(String aName) {
        Collection<Person> vResult = mPersonRepository.findByNameLike(aName);
        return vResult;
    }

    @Transactional(readOnly = true)
    public Collection<Person> getabunch(Integer aSkip, Integer aLimit) {
        Collection<Person> vResult = mPersonRepository.getabunch(aSkip, aLimit);
        return vResult;
    }
}
