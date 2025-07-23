package com.stellaTech.pokedex.service;

import com.stellaTech.pokedex.dto.PokemonEntryDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PokemonEntryService {
    PokemonEntryDto getPokemonEntry(int id);

    Page<PokemonEntryDto> getPokemonEntryPage(Pageable pageable);
}
