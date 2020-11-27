package com.example.demo.repository;

import com.example.demo.domain.Animal;
import com.example.demo.domain.ZooShop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ZooShopRepository {

    private final AnimalRepository animalRepository;
    private final List<ZooShop> zooShopList = new ArrayList<>();

    @Value("#100")
    private String idPrefix;


    public ZooShopRepository(AnimalRepository animalRepository){
        this.animalRepository = animalRepository;
    }

    public List<ZooShop> getAll(){
        return zooShopList;
    }

    public Optional<ZooShop> getByLocation(String location){
        return zooShopList.stream().filter(zooShop -> zooShop.getLocation().equals(location)).findFirst();
    }

    public void save(ZooShop zooShop){
        zooShopList.add(zooShop);
    }

    public void delete(ZooShop zooShop){
        zooShopList.remove(zooShop);
    }

    private List<Animal> retriveAnimalsFromAnimalRepository(){
        List<Animal> animals = new ArrayList<>();
        Optional<Animal> animalsByName = AnimalRepository.ge
    }



}
