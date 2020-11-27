package com.example.demo.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Animal {

    private String name;
    private Species species;
    public int age;
}
