package com.example.demo.mapper;

import com.example.demo.domain.Animal;
import com.example.demo.domain.ZooShop;
import com.example.demo.dto.AnimalDTO;
import com.example.demo.dto.ZooShopDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ZooShopMapper {

    @Autowired
    private AnimalMapper animalMapper;

    public ZooShop convertZooShopFrom(ZooShopDTO zooShopDTO){
        List<Animal> animalsConverted = new ArrayList<>();
        if(zooShopDTO.getZooShopAnimalList() != null){
            zooShopDTO.getZooShopAnimalList().forEach(animalDTO -> animalsConverted.add(animalMapper.convertAnimalFrom(animalDTO)));
        }
        return ZooShop.builder()
                .location(zooShopDTO.getZooShopLocation())
                .ticketPrice(zooShopDTO.getZooShopTicketPrice())
                .AnimalList(animalsConverted)
                .build();
    }

    public ZooShopDTO convertZooShopDtoFrom(ZooShop zooShop)
    {
        List<AnimalDTO> animalDTOS = new ArrayList<>();
        zooShop.getAnimalList().forEach(animal -> animalDTOS.add(animalMapper.convertAnimalDtoFrom(animal)));
        return ZooShopDTO.builder()
                .zooShopLocation(zooShop.getLocation())
                .zooShopTicketPrice(zooShop.getTicketPrice())
                .zooShopAnimalList(animalDTOS)
                .build();
    }
}
