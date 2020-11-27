package com.unibuc.application.service;

import com.unibuc.application.domain.Song;
import com.unibuc.application.dto.SongDto;
import com.unibuc.application.mapper.SongMapper;
import com.unibuc.application.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SongService {
    private final SongRepository songRepository;
    private final SongMapper songMapper;

    @Autowired
    public SongService(SongRepository songRepository, SongMapper songMapper) {
        this.songRepository = songRepository;
        this.songMapper = songMapper;
    }

    public SongDto getById(Integer id){
        return songMapper.mapToDto(songRepository.getById(id).get());
    }

    public List<SongDto> getAll(){
        return songRepository.getSongList().stream()
                .map(song -> songMapper.mapToDto(song))
                .collect(Collectors.toList());
    }

    public SongDto create(SongDto request){
        Song savedSong = songRepository.save(songMapper.mapToEntity(request));
        return songMapper.mapToDto(savedSong);
    }

    public SongDto update(SongDto request){
        Song updatedSong = songRepository.update(songMapper.mapToEntity(request));
        if(updatedSong != null){
            return songMapper.mapToDto(updatedSong);
        }
        return null;
    }

    public String delete(Integer id){
        return songRepository.delete(id);
    }
}
