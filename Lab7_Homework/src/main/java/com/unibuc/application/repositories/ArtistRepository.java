package com.unibuc.application.repositories;

import com.unibuc.application.domain.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ArtistRepository {
    
    private final List<Artist> artistList = new ArrayList<>();

    @Autowired
    public SongRepository songRepository;

    public ArtistRepository(){
        initArtistList();
    }

    public List<Artist> getArtistList(){
        return artistList;
    }

    public Optional<Artist> getById(Long id){
        return artistList.stream().filter(artist -> artist.getId().equals(id)).findFirst();
    }

    public Artist save(Artist request)
    {
        artistList.add(request);
        return request;
    }

    public String delete(Long id){
        Optional<Artist> artistOptional = getById(id);
        if(artistOptional.isPresent()){
            artistList.remove(artistOptional.get());
            return "Artist removed";
        }
        return "Artist NOT removed";
    }

    public Artist update(Artist request){
        Optional<Artist> artistOptional = getById(request.getId());
        if(artistOptional.isPresent()){
            artistList.remove(artistOptional.get());
            artistList.add(request);
            return  getById(request.getId()).get();
        }
        return null;
    }

    private void initArtistList() {

        artistList.add(Artist.builder()
                .id(1L)
                .name("Iron Maiden")
                .age(45)
                .city("London")
                .songs(songRepository.getSongSublist(1, 4))
                .build());

        artistList.add(Artist.builder()
                .id(2L)
                .name("Metallica")
                .age(39)
                .city("Los Angeles")
                .songs(songRepository.getSongSublist(2, 5))
                .build());

        artistList.add(Artist.builder()
                .id(3L)
                .name("Nirvana")
                .age(33)
                .city("Washington")
                .songs(songRepository.getSongSublist(3, 6))
                .build());
    }
}
