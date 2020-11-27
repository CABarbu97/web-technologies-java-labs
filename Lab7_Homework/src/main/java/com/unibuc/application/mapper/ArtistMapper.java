package com.unibuc.application.mapper;

import com.unibuc.application.domain.Artist;
import com.unibuc.application.dto.ArtistDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper()
public interface ArtistMapper {

    @Mappings({
            @Mapping(target = "artistName", source = "entity.name"),
            @Mapping(target = "artistId", source = "entity.id"),
            @Mapping(target = "artistAge", source = "entity.age"),
            @Mapping(target = "artistSongs", source = "entity.songs"),
            @Mapping(target = "artistCity", source = "entity.city")
    })
    ArtistDto mapToDto(Artist entity);

    @Mappings({
            @Mapping(target = "name", source = "dto.artistName"),
            @Mapping(target = "id", source = "dto.artistId"),
            @Mapping(target = "age", source = "dto.artistAge"),
            @Mapping(target = "songs", source = "dto.artistSongs"),
            @Mapping(target = "city", source = "dto.artistCity")
    })
    Artist mapToEntity(ArtistDto dto);



}
