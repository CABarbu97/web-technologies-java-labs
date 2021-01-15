package com.example.finalProj.dto;
import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MedicDto {
    private String firstName;
    private String lastName;
    private String location;
    private List<PatientDto> patientList;

}
