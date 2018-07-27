package com.test.SpringDataNeo4j;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
public class SpringDataNeo4jApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataNeo4jApplication.class, args);
	}
}
