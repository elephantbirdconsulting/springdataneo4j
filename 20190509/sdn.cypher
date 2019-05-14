CREATE CONSTRAINT ON (m:Movie) ASSERT m.id IS UNIQUE;
CREATE CONSTRAINT ON (p:Person) ASSERT p.id IS UNIQUE;
CREATE INDEX ON :Person(name);
CREATE INDEX ON :Movie(title);

CREATE (:Movie {id: 1, released: 1945, title: "Second World War", avgvote: 4.0, genres: ["War", "Drama"]})
CREATE (:Movie {id: 2, released: 1972, title: "A star was born", genres: ["Comedy", "Drama"]})
CREATE (:Movie {id: 3, released: 1974, title: "A second star was born", avgvote: 5.0})

CREATE (:Person {id: 1, name: "Tom Geudens", birthyear: 1972, deathyear: 2019})
CREATE (:Person {id: 2, name: "Igor Geudens", birthyear: 2010})
CREATE (:Person {id: 3, name: "Martha Geudens", birthyear: 2013});
