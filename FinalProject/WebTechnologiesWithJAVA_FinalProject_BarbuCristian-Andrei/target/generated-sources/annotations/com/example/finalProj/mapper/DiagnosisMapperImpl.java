package com.example.finalProj.mapper;

import com.example.finalProj.domain.Diagnosis;
import com.example.finalProj.dto.DiagnosisDto;
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
public class DiagnosisMapperImpl implements DiagnosisMapper {

    @Override
    public Diagnosis toEntity(DiagnosisDto dto) {
        if ( dto == null ) {
            return null;
        }

        Diagnosis diagnosis = new Diagnosis();

        return diagnosis;
    }

    @Override
    public DiagnosisDto toDto(Diagnosis entity) {
        if ( entity == null ) {
            return null;
        }

        DiagnosisDto diagnosisDto = new DiagnosisDto();

        return diagnosisDto;
    }

    @Override
    public List<Diagnosis> toEntity(List<DiagnosisDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Diagnosis> list = new ArrayList<Diagnosis>( dtoList.size() );
        for ( DiagnosisDto diagnosisDto : dtoList ) {
            list.add( toEntity( diagnosisDto ) );
        }

        return list;
    }

    @Override
    public List<DiagnosisDto> toDto(List<Diagnosis> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DiagnosisDto> list = new ArrayList<DiagnosisDto>( entityList.size() );
        for ( Diagnosis diagnosis : entityList ) {
            list.add( toDto( diagnosis ) );
        }

        return list;
    }
}
