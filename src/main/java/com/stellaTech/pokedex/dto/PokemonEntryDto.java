package com.stellaTech.pokedex.dto;

import lombok.Value;

import java.math.BigDecimal;
import java.util.List;

@Value
public class PokemonEntryDto {
    int id;
    String name;
    List<TypeDto> types;
    BigDecimal height;
    BigDecimal weight;
    List<StatisticDto> stats;
}
