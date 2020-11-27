package com.unibuc.application.domain;


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
public class Artist {

    private Long id;
    @NotNull
    private String name;
    private int age;
    private String city;
    @Autowired
    private List<Song> songs;
}
