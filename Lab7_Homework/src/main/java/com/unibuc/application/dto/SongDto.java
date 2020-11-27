package com.unibuc.application.dto;
import lombok.*;

import javax.validation.constraints.NotNull;
import java.time.Year;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class SongDto {

    @NotNull
    private String songName;
    private Integer songId;
    private double songLength;
    private Year songReleaseYear;
}
