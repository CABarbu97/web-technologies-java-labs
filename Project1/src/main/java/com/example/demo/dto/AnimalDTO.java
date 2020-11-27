package com.example.demo.dto;

import com.example.demo.domain.Species;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class AnimalDTO {

    @NotNull
    @Size(min=3, max=12)
    private String animalName;
    private Species animalSpecies;
    private int animalAge;
}
