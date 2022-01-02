package com.example.model;

import lombok.*;

import java.util.Date;
@NoArgsConstructor
@Data
@AllArgsConstructor
@ToString @EqualsAndHashCode
public class Carwash {
    private int id;
    private Driver driver;
    private Car car;
    private Date date;
    private float price;



}
