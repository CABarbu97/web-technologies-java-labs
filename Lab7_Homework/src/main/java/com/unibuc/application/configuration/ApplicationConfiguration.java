package com.unibuc.application.configuration;

import com.unibuc.application.mapper.ArtistMapper;
import com.unibuc.application.mapper.ArtistMapperImpl;
import com.unibuc.application.mapper.SongMapper;
import com.unibuc.application.mapper.SongMapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public SongMapper songMapper(){
        return new SongMapperImpl();
    }

    @Bean
    public ArtistMapper artistMapper(){
        return new ArtistMapperImpl();
    }
}
