package com.example.finalProj.dto;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class PatientDto {
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @Min(16)
    private Integer age;
    private Boolean hasSymptoms;
    private List<SymptomDto> symptomList;

}
