package com.stellaTech.pokedex.ReadDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Value;

import java.math.BigDecimal;
import java.util.List;

@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class PokemonEntryDto {
    int id;
    String name;
    List<TypeDto> types;
    BigDecimal height;
    BigDecimal weight;
    List<StatisticDto> stats;
}
