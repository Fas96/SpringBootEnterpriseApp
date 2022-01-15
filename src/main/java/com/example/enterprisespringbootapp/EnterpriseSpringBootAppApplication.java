package com.example.enterprisespringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
@EnableConfigurationProperties(value = CarwasherProperties.class)
@ComponentScan("com.example")
public class EnterpriseSpringBootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnterpriseSpringBootAppApplication.class, args);
    }



}
