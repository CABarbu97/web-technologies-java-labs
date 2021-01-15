package com.example.finalProj.service;

import com.example.finalProj.domain.Symptom;
import com.example.finalProj.exceptions.EntityNotFoundException;
import com.example.finalProj.repositories.SymptomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SymptomService {

    private final SymptomRepository symptomRepository;

    @Autowired
    public SymptomService(SymptomRepository symptomRepository) {
        this.symptomRepository = symptomRepository;
    }

    public Symptom create(Symptom request){
        return symptomRepository.insertSymptom(request);
    }

    public void deleteAll(){
        symptomRepository.deleteAllSymptoms();
    }

    public Symptom findByName(String request){
        return symptomRepository.findByName(request)
                .orElseThrow(() -> new EntityNotFoundException("Symptom"));
    }
}
