package com.ebc.neo4j.moviesdemo.repositories;

import com.ebc.neo4j.moviesdemo.domains.Person;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface PersonRepository extends Neo4jRepository<Person, Long> {
    @Query("MATCH (p:Person) WHERE p.id = {id} RETURN p")
    Person findByUniqueConstraint(@Param("id") Long id);

    Person findByName(@Param("name") String name);

    Collection<Person> findByNameLike(@Param("name") String name);

    @Query("MATCH (p:Person) RETURN p SKIP {skip} LIMIT {limit}")
    Collection<Person> getabunch(@Param("skip") Integer skip, @Param("limit") Integer limit);
}
