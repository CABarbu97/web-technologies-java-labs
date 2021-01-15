package com.example.finalProj.mapper;

import com.example.finalProj.domain.Medic;
import com.example.finalProj.dto.MedicDto;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-01-15T12:30:09+0200",
    comments = "version: 1.4.1.Final, compiler: javac, environment: Java 11.0.9.1 (Ubuntu)"
)
@Component
public class MedicMapperImpl implements MedicMapper {

    @Override
    public Medic toEntity(MedicDto dto) {
        if ( dto == null ) {
            return null;
        }

        Medic medic = new Medic();

        return medic;
    }

    @Override
    public MedicDto toDto(Medic entity) {
        if ( entity == null ) {
            return null;
        }

        MedicDto medicDto = new MedicDto();

        return medicDto;
    }

    @Override
    public List<Medic> toEntity(List<MedicDto> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Medic> list = new ArrayList<Medic>( dtoList.size() );
        for ( MedicDto medicDto : dtoList ) {
            list.add( toEntity( medicDto ) );
        }

        return list;
    }

    @Override
    public List<MedicDto> toDto(List<Medic> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<MedicDto> list = new ArrayList<MedicDto>( entityList.size() );
        for ( Medic medic : entityList ) {
            list.add( toDto( medic ) );
        }

        return list;
    }
}
