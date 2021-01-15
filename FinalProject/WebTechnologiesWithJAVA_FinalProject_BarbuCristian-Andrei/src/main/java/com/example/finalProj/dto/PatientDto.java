package com.example.finalProj.dto;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PatientDto {
    private String firstName;
    private String lastName;
    private Integer age;
    private Boolean hasSymptoms;
    private List<SymptomDto> symptomList;

}
