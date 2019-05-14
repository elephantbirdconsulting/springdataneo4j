package com.ebc.neo4j.moviesdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories("com.ebc.neo4j.moviesdemo.repositories")
public class MoviesDemoApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(MoviesDemoApplication.class, args);
    }
}
