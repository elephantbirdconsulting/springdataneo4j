package com.ebc.neo4j.moviesdemo.domains;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Movie {
    @Id
    @GeneratedValue
    private Long internalid;

    private Long id;
    private String title;
    private Integer released;
    private Float avgvote;
    private String[] genres;

    public Movie() {
    }

    public Movie(Long aid, String atitle, Integer areleased, Float aavgvote, String[] agenres) {
        this.id = aid;
        this.title = atitle;
        this.released = areleased;
        this.avgvote = aavgvote;
        this.genres = agenres;
    }

    public Long getInternalid() {
        return this.internalid;
    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public Integer getReleased() {
        return this.released;
    }

    public Float getAvgvote() {
        return this.avgvote;
    }

    public String[] getGenres() {
        return this.genres;
    }
}

