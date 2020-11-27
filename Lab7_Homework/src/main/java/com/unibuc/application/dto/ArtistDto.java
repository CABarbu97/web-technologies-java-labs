package com.unibuc.application.dto;

import com.unibuc.application.domain.Song;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class ArtistDto {


    private Long artistId;
    @NotNull
    private String artistName;
    private int artistAge;
    private String artistCity;
    @Autowired
    private List<Song> artistSongs;
}
