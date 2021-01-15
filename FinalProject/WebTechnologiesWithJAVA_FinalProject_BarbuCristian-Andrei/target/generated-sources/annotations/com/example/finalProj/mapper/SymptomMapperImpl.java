package com.example.finalProj.mapper;

import com.example.finalProj.domain.Symptom;
import com.example.finalProj.dto.SymptomDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-15T20:20:06+0200",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.9.1 (Ubuntu)"
)
@Component
public class SymptomMapperImpl implements SymptomMapper {

    @Override
    public List<Symptom> toEntity(List<SymptomDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Symptom> list = new ArrayList<Symptom>( dtoList.size() );
        for ( SymptomDto symptomDto : dtoList ) {
            list.add( toEntity( symptomDto ) );
        }

        return list;
    }

    @Override
    public List<SymptomDto> toDto(List<Symptom> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SymptomDto> list = new ArrayList<SymptomDto>( entityList.size() );
        for ( Symptom symptom : entityList ) {
            list.add( toDto( symptom ) );
        }

        return list;
    }

    @Override
    public Symptom toEntity(SymptomDto dto) {
        if ( dto == null ) {
            return null;
        }

        String name = null;
        String description = null;

        Symptom symptom = new Symptom( name, description );

        return symptom;
    }

    @Override
    public SymptomDto toDto(Symptom entity) {
        if ( entity == null ) {
            return null;
        }

        SymptomDto symptomDto = new SymptomDto();

        return symptomDto;
    }
}
