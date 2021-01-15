package com.example.finalProj.rest;

import com.example.finalProj.domain.Symptom;
import com.example.finalProj.dto.SymptomDto;
import com.example.finalProj.mapper.SymptomMapper;
import com.example.finalProj.service.SymptomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("symptoms")
public class SymptomController {

    private final SymptomMapper mapper;
    private final SymptomService service;

    @Autowired
    public SymptomController(@Qualifier("symptomMapper") SymptomMapper mapper, SymptomService service) {
        this.mapper = mapper;
        this.service = service;
    }

    @PostMapping(path = "/create", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SymptomDto> create(@Valid @RequestBody SymptomDto request){
        Symptom saved = service.create(mapper.toEntity(request));
        return new ResponseEntity<>(mapper.toDto(saved), HttpStatus.CREATED);
    }

    @DeleteMapping(path = "/deleteAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> deleteAll(){
        service.deleteAll();
        return null;
    }

    @GetMapping(path = "{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<SymptomDto> findByName(@PathVariable String name){

        Symptom found = service.findByName(name);
        if(found.equals(null))
            return null;
        return new ResponseEntity<>(mapper.toDto(found), HttpStatus.FOUND);
    }
}
