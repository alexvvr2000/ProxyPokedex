package com.stellaTech.pokedex.service.serviceProxy;

import com.stellaTech.pokedex.ReadDto.PokemonEntryDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PokemonEntryService {
    PokemonEntryDto getPokemonEntry(int id);

    Page<PokemonEntryDto> getPokemonEntryPage(Pageable pageable);
}
