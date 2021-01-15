package com.example.finalProj.mapper;

import com.example.finalProj.domain.Diagnosis;
import com.example.finalProj.dto.DiagnosisDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DiagnosisMapper extends EntityMapper<DiagnosisDto, Diagnosis>{
}
