package com.unibuc.application.service;

import com.unibuc.application.domain.Artist;
import com.unibuc.application.dto.ArtistDto;
import com.unibuc.application.mapper.ArtistMapper;
import com.unibuc.application.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ArtistService {

    private ArtistRepository artistRepository;
    private final ArtistMapper artistMapper;

    @Autowired
    public ArtistService(ArtistRepository artistRepository, ArtistMapper artistMapper) {
        this.artistRepository = artistRepository;
        this.artistMapper = artistMapper;
    }

    public ArtistDto getById(Long id){
        return artistMapper.mapToDto(artistRepository.getById(id).get());
    }

    public List<ArtistDto> getAll(){
        return artistRepository.getArtistList().stream()
                .map(artist -> artistMapper.mapToDto(artist))
                .collect(Collectors.toList());
    }

    public ArtistDto create(ArtistDto request){
        Artist savedArtist = artistRepository.save(artistMapper.mapToEntity(request));
        return artistMapper.mapToDto(savedArtist);
    }

    public ArtistDto update(ArtistDto request){
        Artist updatedArtist = artistRepository.update(artistMapper.mapToEntity(request));
        if(updatedArtist != null){
            return artistMapper.mapToDto(updatedArtist);
        }
        return null;
    }

    public String delete(Long id){
        return artistRepository.delete(id);
    }


}
