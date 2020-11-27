package com.example.demo.dto;

import lombok.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ZooShopDTO {

    @NotNull
    private String zooShopLocation;
    @NotNull
    private double zooShopTicketPrice;
    private List<AnimalDTO> zooShopAnimalList;
}
