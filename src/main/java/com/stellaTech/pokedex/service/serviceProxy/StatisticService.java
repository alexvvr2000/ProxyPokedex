package com.stellaTech.pokedex.service.serviceProxy;

import com.stellaTech.pokedex.ReadDto.StatisticDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StatisticService {
    StatisticDto getStatistic(int id);

    Page<StatisticDto> getPageStatistic(Pageable pageable);
}
