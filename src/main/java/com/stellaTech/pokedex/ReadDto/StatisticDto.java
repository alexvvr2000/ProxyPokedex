package com.stellaTech.pokedex.ReadDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Value;

@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class StatisticDto {
    int id;
    boolean is_battle_only;
    String name;
}
