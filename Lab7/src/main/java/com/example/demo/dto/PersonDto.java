package com.example.demo.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PersonDto {

    private Long id;
    private String name;
    private String city;
    private Integer age;
    private String description;
}
