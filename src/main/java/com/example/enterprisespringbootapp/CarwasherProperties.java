package com.example.enterprisespringbootapp;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "carwasher")
public class CarwasherProperties {
    private String loadTestData="no";

    public String getLoadTestData() {
        return loadTestData;
    }

    public void setLoadTestData(String loadTestData) {
        this.loadTestData = loadTestData;
    }
}
