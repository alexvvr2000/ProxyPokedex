package com.stellaTech.pokedex.service;

import com.stellaTech.pokedex.dto.TypeDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TypeService {
    TypeDto getType(int id);

    Page<TypeDto> getPageType(Pageable pageable);
}
