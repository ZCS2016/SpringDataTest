package com.test.SpringDataJPA.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages="com.test.SpringDataJPA.dao")
public class DBConfig {
}
