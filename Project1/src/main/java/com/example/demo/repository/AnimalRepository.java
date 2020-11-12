package com.example.demo.repository;

import com.example.demo.domain.Animal;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimalRepository implements InitializingBean {


    @Override
    public void afterPropertiesSet() throws Exception {

    }

    private final List<Animal> AnimalList = new ArrayList<>();
    public List<Animal> getAllAnimals(){return AnimalList;}

    public Optional<Animal> getAnimalByName(String name){
        return AnimalList.stream().filter(animal -> animal.
    }


}
