package com.example.finalProj.domain;

import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Medic {

    private String firstName;
    private String lastName;
    private String location;
    private List<Patient> patientList;
}
