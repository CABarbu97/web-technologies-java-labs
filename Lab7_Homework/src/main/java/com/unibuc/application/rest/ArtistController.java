package com.unibuc.application.rest;

import com.unibuc.application.dto.ArtistDto;
import com.unibuc.application.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/artists")
public class ArtistController {
    private final ArtistService artistService;

    @Autowired
    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }

    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ArtistDto> getAll(){
        return artistService.getAll();
    }

    @PostMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ArtistDto> create(@Valid @RequestBody ArtistDto request){
        return new ResponseEntity<>(artistService.create(request), HttpStatus.CREATED);
    }

    @PostMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ArtistDto> update(@RequestBody @Valid ArtistDto request){
        return new ResponseEntity<>(artistService.update(request), artistService.update(request) != null ? HttpStatus.OK : HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(path = "/delete/{id}")
    public String delete(@PathVariable Long id){
        return artistService.delete(id);
    }
}
