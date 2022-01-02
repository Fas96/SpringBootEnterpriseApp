package com.example.model;

import lombok.*;

@NoArgsConstructor
@Data
@AllArgsConstructor
@ToString@EqualsAndHashCode
public class Driver {
    private int id;
    private String name;
    private String surname;
    private String phone;
    private String address;
}
