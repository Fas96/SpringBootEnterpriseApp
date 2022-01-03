package com.example.controllers;

import com.example.model.Car;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
class ResttestTest {

    @Test
    void getTest() {
        RestTemplate restTemplate= new RestTemplate();
        String srcurl="http://localhost:8082";
        ResponseEntity<String> response=restTemplate.getForEntity(srcurl,String.class);
        log.info("{}",response);

    }
    @Test
    void getTestObject() {
        RestTemplate restTemplate= new RestTemplate();
        String srcurl="http://localhost:8082/cars";
        ArrayList<Car> car=restTemplate.getForObject(srcurl,ArrayList.class);
        assert car != null;

        log.info("The cars received from the restful temtplate from  the url cars:: {}:::",car);

    }

    @Test
    void getTestHttpEntity() {
        RestTemplate restTemplate= new RestTemplate();
        HttpEntity<Car> request= new HttpEntity<>(new Car());
        Car car = restTemplate.postForObject("http://localhost:8082/cars/addCar",request,Car.class);

        assert car != null;

        log.info("Post response:: {}:::",car);

    }


    @Test
    void getTestHttpEntityReturnURI() {
        RestTemplate restTemplate= new RestTemplate();
        HttpEntity<Car> request= new HttpEntity<>(new Car());
        URI uri = restTemplate.postForObject("http://localhost:8082/cars/url",request,URI.class);

        assert uri != null;

        log.info("Post response:: {}:::",uri);

    }



    @Test
    void testFormSubmission(){
        SimpleClientHttpRequestFactory clientHttpRequestFactory = new SimpleClientHttpRequestFactory();
        // Connect timeout: time is in milliseconds
        clientHttpRequestFactory.setConnectTimeout(3000);
        // Read timeout: time is in milliseconds
        clientHttpRequestFactory.setReadTimeout(3000);
        RestTemplate restTemplate= new RestTemplate(clientHttpRequestFactory);

        HttpHeaders headers= new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        MultiValueMap<String,String> map = new LinkedMultiValueMap<>();
        map.add("id","2012");
        map.add("username","Fas");
        map.add("password","bhim");

        HttpEntity<MultiValueMap<String,String>> request= new HttpEntity<>(map,headers);

        ResponseEntity<String> response= restTemplate.postForEntity("http://localhost:8082/cars/form",request,String.class);

    }
}