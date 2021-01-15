package com.example.finalProj.mapper;

import com.example.finalProj.domain.Patient;
import com.example.finalProj.dto.PatientDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = SymptomMapper.class)
public interface PatientMapper extends EntityMapper<PatientDto, Patient>{

    List<Patient> toEntity(List<PatientDto> dtoList);

    List<PatientDto> toDto(List<Patient> entityList);
}
