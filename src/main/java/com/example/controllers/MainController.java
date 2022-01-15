package com.example.controllers;

import com.example.model.Car;
import com.example.model.Driver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Controller@Slf4j
public class MainController {
    @GetMapping(value="")
    public String showmain(){
        return "index";
    }


    @GetMapping(value="/cars")
    @ResponseBody
    public List<Car> getCars(){

        List<Car> cars= new ArrayList<>();
//        repeated add cars on refresh
//        check if car in cars before adding
        cars.add(new Car(1,"TESLA","WHITE",new Driver(1,"FAS","BHIM","010100101","daejeon"),2019));
        cars.add(new Car(2,"BMW","BLACK",new Driver(2,"ANYAS","FIRIBU","010100101","pangyo"),2019));
        return cars;
    }

    @GetMapping(value="/cars/{index}")
    @ResponseBody
    public ResponseEntity<Car> getCarsWithIndex(@PathVariable("index") int index){

        List<Car> cars= new ArrayList<>();
//        repeated add cars on refresh
//        check if car in cars before adding
        cars.add(new Car(1,"TESLA","WHITE",new Driver(1,"FAS","BHIM","010100101","daejeon"),2019));
        cars.add(new Car(2,"BMW","BLACK",new Driver(2,"ANYAS","FIRIBU","010100101","pangyo"),2019));
        return ResponseEntity.ok( cars.get(index));
    }

    @PostMapping(value="/cars/addCar")
    @ResponseBody
    public Car addCar(Car car){

        List<Car> cars= new ArrayList<>();
        cars.add(car);
         return  car;
    }
    @PostMapping(value="/cars/url")
    @ResponseBody
    public URI addCarURI(Car car) throws URISyntaxException {

        List<Car> cars= new ArrayList<>();
        cars.add(car);
        return  new URI("http://localhost:8082/cars/url");
    }

    @PostMapping(value="/cars/form")
    @ResponseBody
    public String addUserForm(HttpServletRequest request, HttpServletResponse res) throws URISyntaxException {

       log.info("userId {}| username {} passewordd{}",request.getAttribute("id"), request.getAttribute("username"),request.getAttribute("password"));
        return  "POST SUCCESS";
    }
}
