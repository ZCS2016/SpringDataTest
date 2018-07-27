package com.example.SpringDataNeo4j.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan(basePackages = "com.example.SpringDataNeo4j.web.entity")
@EnableNeo4jRepositories(basePackages = "com.example.SpringDataNeo4j.web.dao")
@EnableTransactionManagement
public class Neo4jConfig {
}
