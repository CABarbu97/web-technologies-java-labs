package com.example.finalProj.domain;

import lombok.*;

import javax.validation.constraints.NotNull;

//@Getter
//@Setter
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Symptom {

    @NotNull
    private String name;
    private String description;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
}
