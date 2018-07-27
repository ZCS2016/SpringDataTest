package com.test.SpringDataNeo4j.web.dao;

import com.test.SpringDataNeo4j.web.entity.Person;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PersonRepository extends Neo4jRepository<Person,Long> {
    Person findPersonByName(String name);
}
