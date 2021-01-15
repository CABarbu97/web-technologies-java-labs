package com.example.finalProj.configuration;
import com.example.finalProj.mapper.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfiguration {

    @Bean
    public MedicMapper medicMapper(){
        return new MedicMapperImpl();
    }

    @Bean
    public PatientMapper patientMapper(){
        return new PatientMapperImpl();
    }

    @Bean
    public SymptomMapper symptomMapper(){
        return new SymptomMapperImpl();
    }
}
