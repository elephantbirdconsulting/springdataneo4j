package com.ebc.neo4j.moviesdemo.domains;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Person {
    @Id @GeneratedValue
    private Long internalid;

    private Long id;
    private String name;
    private Integer birthyear;
    private Integer deathyear;

    public Person() {
    }

    public Person(Long aid, String aname, Integer abirthyear, Integer adeathyear) {
        this.id = aid;
        this.name = aname;
        this.birthyear = abirthyear;
        this.deathyear = adeathyear;
    }

    public Long getInternalid() {
        return this.internalid;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Integer getBirthyear() {
        return this.birthyear;
    }

    public Integer getDeathyear() {
        return this.deathyear;
    }
}

