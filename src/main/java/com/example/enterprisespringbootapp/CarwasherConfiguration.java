package com.example.enterprisespringbootapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class CarwasherConfiguration {
    @Autowired
    private CarwasherProperties carwasherProperties;

    @PostConstruct
    public void init(){
        System.out.println(carwasherProperties.getLoadTestData() );

    }
}
