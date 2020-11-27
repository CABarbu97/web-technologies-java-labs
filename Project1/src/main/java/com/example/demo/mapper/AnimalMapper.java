package com.example.demo.mapper;

import com.example.demo.domain.Animal;
import com.example.demo.dto.AnimalDTO;
import org.springframework.stereotype.Component;

@Component
public class AnimalMapper {

    public Animal convertAnimalFrom(AnimalDTO animalDTO){
        return Animal.builder()
                .name(animalDTO.getAnimalName())
                .species(animalDTO.getAnimalSpecies())
                .age(animalDTO.getAnimalAge())
                .build();
    }

    public AnimalDTO convertAnimalDtoFrom(Animal animal){
        return AnimalDTO.builder()
                .animalName(animal.getName())
                .animalSpecies(animal.getSpecies())
                .animalAge(animal.getAge())
                .build();
    }
}
