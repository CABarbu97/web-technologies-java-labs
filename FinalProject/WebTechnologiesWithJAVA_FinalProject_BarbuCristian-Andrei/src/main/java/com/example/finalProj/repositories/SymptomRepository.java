package com.example.finalProj.repositories;

import com.example.finalProj.domain.Symptom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Optional;

@Repository
public class SymptomRepository {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public SymptomRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Symptom insertSymptom(Symptom symptom){
        String sql = "INSERT INTO SymptomsRepo VALUES(NULL, ?, ?)";
        KeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1, symptom.getName());
            preparedStatement.setString(2, symptom.getDescription());
            return preparedStatement;
        },holder);

        return symptom;
    }

    public void deleteAllSymptoms(){
        String sql = "DELETE FROM SymptomsRepo";
        jdbcTemplate.update(sql);
    }

    public Optional<Symptom> findByName(String symptom){
        String sql = "SELECT * FROM SymptomsRepo WHERE symptomName = ?";
        RowMapper<Symptom> mapper = ((resultSet, i) ->
                new Symptom(
                        resultSet.getString("symptomName"),
                        resultSet.getString("symptomDescription")
                ));

        return jdbcTemplate.query(sql, mapper, symptom).stream().findFirst();
    }
}
