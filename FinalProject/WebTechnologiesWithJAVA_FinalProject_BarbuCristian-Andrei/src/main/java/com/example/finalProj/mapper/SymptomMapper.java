package com.example.finalProj.mapper;

import com.example.finalProj.domain.Symptom;
import com.example.finalProj.dto.SymptomDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SymptomMapper extends EntityMapper<SymptomDto, Symptom>{

    @Override
    Symptom toEntity(SymptomDto dto);

    @Override
    SymptomDto toDto(Symptom entity);
}
