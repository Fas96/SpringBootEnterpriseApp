package com.example.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class Resttest {

    public void getTest(){
        RestTemplate restTemplate= new RestTemplate();

        String srcurl="http://localhost:8082/api/cars";
        ResponseEntity<String> respons=restTemplate.getForEntity(srcurl,String.class);
    }
}
