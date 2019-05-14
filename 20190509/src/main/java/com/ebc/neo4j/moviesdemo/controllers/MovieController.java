package com.ebc.neo4j.moviesdemo.controllers;

import com.ebc.neo4j.moviesdemo.domains.Movie;
import com.ebc.neo4j.moviesdemo.services.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/movie")
public class MovieController {

    // this is what we're working with here
    private final MovieService mMovieService;

    // and the constructor sets it up
    public MovieController(MovieService aMovieService) {
        this.mMovieService = aMovieService;
    }

    @GetMapping("/byid")
    public Movie findByUniqueConstraint(@RequestParam(value = "id", required = true) Long aId) {
        return mMovieService.findByUniqueConstraint(aId);
    }

    @GetMapping("/bytitle")
    public Movie findByTitle(@RequestParam(value = "title", required = true) String aTitle) {
        return mMovieService.findByTitle(aTitle);
    }

    @GetMapping("/bytitlelike")
    public Collection<Movie> findByTitleLike(@RequestParam(value = "title", required = true) String aTitle) {
        return mMovieService.findByTitleLike(aTitle);
    }

    @GetMapping("/getabunch")
    public Collection<Movie> getabunch(@RequestParam(value = "skip",required = false) Integer aSkip, @RequestParam(value = "limit",required = false) Integer aLimit) {
        return mMovieService.getabunch(aSkip == null ? 10 : aSkip, aLimit == null ? 100 : aLimit);
    }
}
