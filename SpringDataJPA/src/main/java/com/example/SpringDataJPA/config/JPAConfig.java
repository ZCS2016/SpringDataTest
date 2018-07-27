package com.example.SpringDataJPA.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= "com.example.SpringDataJPA.web.dao")
public class JPAConfig {
}
