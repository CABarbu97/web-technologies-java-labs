package com.unibuc.application.repositories;

import com.unibuc.application.domain.Song;
import org.springframework.stereotype.Repository;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class SongRepository {

    private final List<Song> songList = new ArrayList<>();

    public SongRepository(){
        initSongList();
    }

    public Optional<Song> getById(Integer id){
        return songList.stream().filter(song -> song.getId().equals(id)).findFirst();
    }

    public List<Song> getSongList() {
        return songList;
    }

    public List<Song> getSongSublist(Integer ...id){
        List<Song> songSubList = new ArrayList<>();
        for(int i=0; i < id.length; i++){
            songSubList.add(getSongList().get(id[i]));
        }
        return songSubList;
    }

    public Song save(Song request){
        songList.add(request);
        return request;
    }

    public Song update(Song request){
        Optional<Song> songOptional =getById(request.getId());
        if(songOptional.isPresent()){
            songList.remove(songOptional.get());
            songList.add(request);
            return getById(request.getId()).get();
        }
        return null;
    }

    public String delete(Integer id){
        Optional<Song> songOptional = getById(id);
        if(songOptional.isPresent()){
            songList.remove(songOptional.get());
            return "Removed";
        }
        return "Song not removed";
    }

    private void initSongList() {

        songList.add(Song.builder()
                .name("Where eagles dare")
                .id(1)
                .length(6.09)
                .releaseYear(Year.of(1983))
                .build());

        songList.add(Song.builder()
                .name("Battery")
                .id(2)
                .length(5.10)
                .releaseYear(Year.of(1986))
                .build());

        songList.add(Song.builder()
                .name("Heart-shaped box")
                .id(3)
                .length(4.44)
                .releaseYear(Year.of(1993))
                .build());

        songList.add(Song.builder()
                .name("Empire of the Clouds")
                .id(4)
                .length(18.10)
                .releaseYear(Year.of(2015))
                .build());

        songList.add(Song.builder()
                .name("One")
                .id(5)
                .length(7.23)
                .releaseYear(Year.of(1988))
                .build());

        songList.add(Song.builder()
                .name("In Bloom")
                .id(6)
                .length(4.59)
                .releaseYear(Year.of(1991))
                .build());
    }
}
