package com.example.finalProj.mapper;

import com.example.finalProj.domain.Medic;
import com.example.finalProj.dto.MedicDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring", uses = PatientMapper.class)
public interface MedicMapper extends EntityMapper<MedicDto, Medic> {

    List<Medic> toEntity(List<MedicDto> dtoList);
//
    List<MedicDto> toDto(List<Medic> entityList);
}
