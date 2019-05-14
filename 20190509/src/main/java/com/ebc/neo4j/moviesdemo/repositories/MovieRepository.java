package com.ebc.neo4j.moviesdemo.repositories;

import com.ebc.neo4j.moviesdemo.domains.Movie;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface MovieRepository extends Neo4jRepository<Movie, Long> {
    @Query("MATCH (m:Movie) WHERE m.id = {id} RETURN m")
    Movie findByUniqueConstraint(@Param("id") Long id);

    Movie findByTitle(@Param("title") String title);

    Collection<Movie> findByTitleLike(@Param("title") String title);

    @Query("MATCH (m:Movie) RETURN m SKIP {skip} LIMIT {limit}")
    Collection<Movie> getabunch(@Param("skip") Integer skip, @Param("limit") Integer limit);
}
