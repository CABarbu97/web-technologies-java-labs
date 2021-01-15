package com.example.finalProj.mapper;

import com.example.finalProj.domain.Patient;
import com.example.finalProj.dto.PatientDto;
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
public class PatientMapperImpl implements PatientMapper {

    @Override
    public Patient toEntity(PatientDto dto) {
        if ( dto == null ) {
            return null;
        }

        Patient patient = new Patient();

        return patient;
    }

    @Override
    public PatientDto toDto(Patient entity) {
        if ( entity == null ) {
            return null;
        }

        PatientDto patientDto = new PatientDto();

        return patientDto;
    }

    @Override
    public List<Patient> toEntity(List<PatientDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Patient> list = new ArrayList<Patient>( dtoList.size() );
        for ( PatientDto patientDto : dtoList ) {
            list.add( toEntity( patientDto ) );
        }

        return list;
    }

    @Override
    public List<PatientDto> toDto(List<Patient> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PatientDto> list = new ArrayList<PatientDto>( entityList.size() );
        for ( Patient patient : entityList ) {
            list.add( toDto( patient ) );
        }

        return list;
    }
}
