package com.example.finalProj.domain;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Patient {

    private String firstName;
    private String lastName;
    private Integer age;
    private Boolean hasSymptoms;
    private List<Symptom> symptomList;
}
