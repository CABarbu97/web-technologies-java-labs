package com.example.finalProj.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Diagnosis {

    private String name;
    //urmeaza sa introduc o serie de medicamente in repo ca tratament pentru diagnosticul dat. Legatura se va face in functie de name
    private List<Medication> medicationList;
}
