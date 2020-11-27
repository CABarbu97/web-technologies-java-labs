package com.example.demo.service;

import com.example.demo.domain.Person;
import com.example.demo.dto.PersonDto;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public PersonDto get(Long id){
        return mapToDto(personRepository.get(id).get());
    }

    public List<PersonDto> getAll(){
        return personRepository.getAll().stream()
                .map(this::mapToDto)
                .collect(Collectors.toList());
    }

    public PersonDto create(PersonDto request)
    {
        Person savedPerson = personRepository.save(mapToEntity(request));
        return mapToDto(savedPerson);
    }

    public PersonDto update(PersonDto request)
    {
        Person updatedPerson = personRepository.update(mapToEntity(request));
        return mapToDto(updatedPerson);
    }

    public String delete(Long id){
        return  personRepository.delete(id);
    }

    private Person mapToEntity(PersonDto personDto){
        return Person.builder()
                .id(personDto.getId())
                .name(personDto.getName())
                .city(personDto.getCity())
                .additionalInfo(personDto.getDescription())
                .age(personDto.getAge())
                .build();
    }

    private PersonDto mapToDto(Person person){
        return PersonDto.builder()
                .id(person.getId())
                .name(person.getName())
                .city(person.getCity())
                .description(person.getAdditionalInfo())
                .age(person.getAge())
                .build();
    }
}
