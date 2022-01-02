package com.example.model;

import lombok.*;

@NoArgsConstructor@Data@AllArgsConstructor@ToString@EqualsAndHashCode
public class Car {
    private int id;
    private String model;
    private String color;
    private Driver driver;
    private int year;

}
