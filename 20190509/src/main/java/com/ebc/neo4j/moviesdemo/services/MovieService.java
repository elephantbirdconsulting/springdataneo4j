package com.ebc.neo4j.moviesdemo.services;

import com.ebc.neo4j.moviesdemo.domains.Movie;
import com.ebc.neo4j.moviesdemo.repositories.MovieRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
public class MovieService {
    // not using this, so I'm not having it ...
    // private final static Logger mLog = LoggerFactory.getLogger(MovieService.class);

    // this is what we're working with here
    private final MovieRepository mMovieRepository;

    // and the constructor sets it up
    public MovieService(MovieRepository aMovieRepository) {
        this.mMovieRepository = aMovieRepository;
    }

    @Transactional(readOnly = true)
    public Movie findByUniqueConstraint(Long aId) {
        Movie vResult = mMovieRepository.findByUniqueConstraint(aId);
        return vResult;
    }

    @Transactional(readOnly = true)
    public Movie findByTitle(String aTitle) {
        Movie vResult = mMovieRepository.findByTitle(aTitle);
        return vResult;
    }

    @Transactional(readOnly = true)
    public Collection<Movie> findByTitleLike(String aTitle) {
        Collection<Movie> vResult = mMovieRepository.findByTitleLike(aTitle);
        return vResult;
    }

    @Transactional(readOnly = true)
    public Collection<Movie> getabunch(Integer aSkip, Integer aLimit) {
        Collection<Movie> vResult = mMovieRepository.getabunch(aSkip, aLimit);
        return vResult;
    }
}
