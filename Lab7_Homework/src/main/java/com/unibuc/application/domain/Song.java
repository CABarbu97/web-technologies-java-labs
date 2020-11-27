package com.unibuc.application.domain;



import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.Year;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class Song {

    @NotNull
    private String name;
    private Integer id;
    private double length;
    private Year releaseYear;
}
