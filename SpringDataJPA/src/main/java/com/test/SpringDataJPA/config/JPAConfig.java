package com.test.SpringDataJPA.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= "com.test.SpringDataJPA.web.dao")
public class JPAConfig {
}
