package com.stellaTech.pokedex.service.serviceProxy;

import com.stellaTech.pokedex.ReadDto.TypeDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TypeService {
    TypeDto getType(int id);

    Page<TypeDto> getPageType(Pageable pageable);
}
