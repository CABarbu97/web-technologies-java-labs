package com.example.finalProj.repositories;

import com.example.finalProj.domain.Patient;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PatientRepository {

    private final JdbcTemplate jdbcTemplate;

    public PatientRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //metode CRUD pentru patient

//    public Patient create(Patient patient){
//
//    }
}
