package com.example.SpringDataElasticsearch.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.example.SpringDataElasticsearch.web.dao")
public class ElasticsearchConfig {
}
