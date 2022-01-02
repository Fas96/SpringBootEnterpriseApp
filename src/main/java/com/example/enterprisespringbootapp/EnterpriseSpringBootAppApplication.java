package com.example.enterprisespringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = CarwasherProperties.class)
public class EnterpriseSpringBootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnterpriseSpringBootAppApplication.class, args);
    }

}
