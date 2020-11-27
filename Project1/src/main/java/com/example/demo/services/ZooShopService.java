package com.example.demo.services;

import com.example.demo.domain.ZooShop;
import com.example.demo.dto.ZooShopDTO;
import com.example.demo.mapper.AnimalMapper;
import com.example.demo.mapper.ZooShopMapper;
import com.example.demo.repository.ZooShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ZooShopService {

    private final AnimalMapper animalMapper;
    private final ZooShopMapper zooShopMapper;
    private final ZooShopRepository zooShopRepository;

    @Autowired

    public ZooShopService(AnimalMapper animalMapper, ZooShopMapper zooShopMapper, ZooShopRepository zooShopRepository) {
        this.animalMapper = animalMapper;
        this.zooShopMapper = zooShopMapper;
        this.zooShopRepository = zooShopRepository;
    }

    public List<ZooShopDTO> getAllZooShops(){
        return zooShopRepository.getAll().stream().map(zooShopMapper::convertZooShopDtoFrom).collect(Collectors.toList());
    }

    public ZooShopDTO getZooShopByLocation(String location){
        return zooShopMapper.convertZooShopDtoFrom(zooShopRepository.getByLocation(location).get());
    }

    public void createZooShop(ZooShopDTO zooShopDTO)
    {
        zooShopRepository.save(zooShopMapper.convertZooShopFrom(zooShopDTO));
    }

    public void delete(String location){
        ZooShop found = zooShopRepository.getByLocation(location).get();
        zooShopRepository.delete(found);
    }
}
