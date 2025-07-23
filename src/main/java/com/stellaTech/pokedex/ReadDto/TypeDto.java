package com.stellaTech.pokedex.ReadDto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Value;

@Value
@JsonIgnoreProperties(ignoreUnknown = true)
public class TypeDto {
    int id;
    String name;
}