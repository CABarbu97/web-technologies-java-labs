package com.unibuc.application.mapper;

import com.unibuc.application.domain.Song;
import com.unibuc.application.dto.SongDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper()
public interface SongMapper {
    @Mappings({
            @Mapping(target = "songName", source ="entity.name"),
            @Mapping(target = "songId", source = "entity.id"),
            @Mapping(target = "songLength", source = "entity.length" ),
            @Mapping(target = "songReleaseYear", source = "entity.releaseYear")
    })
    SongDto mapToDto(Song entity);

    @Mappings({
            @Mapping(target = "name", source = "dto.songName"),
            @Mapping(target = "id", source = "dto.songId"),
            @Mapping(target = "length", source = "dto.songLength"),
            @Mapping(target = "releaseYear", source = "dto.songReleaseYear")
    })
    Song mapToEntity(SongDto dto);
}
