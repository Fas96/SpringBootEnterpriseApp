package com.example.controllers;

import com.example.model.Car;
import com.example.model.Driver;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping(value="")
    public String showmain(){
        return "index";
    }


    @GetMapping(value="/cars")
    @ResponseBody
    public List<Car> getCars(){
        List<Car> cars= new ArrayList<>();
        cars.add(new Car(1,"TESLA","WHITE",new Driver(1,"FAS","BHIM","010100101","daejeon"),2019));
        return cars;
    }
}
