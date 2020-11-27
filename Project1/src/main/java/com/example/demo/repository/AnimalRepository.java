package com.example.demo.repository;

import com.example.demo.domain.Animal;
import com.example.demo.domain.Species;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class AnimalRepository implements InitializingBean {


    @Override
    public void afterPropertiesSet() throws Exception {

    }

    private final List<Animal> AnimalList = new ArrayList<>();
    public List<Animal> getAllAnimals(){return AnimalList;}

    public Optional<Animal> getAnimalByName(String name){
        return AnimalList.stream().filter(animal -> animal.getName().equals(name)).findFirst();
    }

    private void createAndSave(String name, Species species, int age)
    {
        Animal newAnimal = Animal.builder()
                .name(name)
                .species(species)
                .age(age)
                .build();
        AnimalList.add(newAnimal);
    }


}
