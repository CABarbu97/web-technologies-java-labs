package com.example.demo.domain;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {

    private Long id;
    private String name;
    private String city;
    private Integer age;
    private String additionalInfo;
}
