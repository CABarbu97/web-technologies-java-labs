package com.unibuc.application.rest;

import com.unibuc.application.dto.SongDto;
import com.unibuc.application.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(path = "/songs")
public class SongController {

    private final SongService songService;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<SongDto> getAll(){
        return songService.getAll();
    }

    @GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SongDto> getById(@PathVariable Integer id){
        return new ResponseEntity<>(songService.getById(id), HttpStatus.OK);
    }

    @PostMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SongDto> create(@Valid @RequestBody SongDto request){
        return new ResponseEntity<>(songService.create(request), HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity<SongDto> update(@Valid @RequestBody SongDto request){
        return new ResponseEntity<>(songService.update(request), songService.update(request) != null ? HttpStatus.OK : HttpStatus.NO_CONTENT);
    }

    @DeleteMapping(path = "/delete/{id}")
    public String delete(@PathVariable Integer id){
        return songService.delete(id);
    }
}
