package com.example.demo.domain;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ZooShop {

    public String location;
    public double ticketPrice;
    public List<Animal> AnimalList;
}
