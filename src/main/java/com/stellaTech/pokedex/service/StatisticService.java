package com.stellaTech.pokedex.service;

import com.stellaTech.pokedex.dto.StatisticDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StatisticService {
    StatisticDto getStatistic(int id);

    Page<StatisticDto> getPageStatistic(Pageable pageable);
}
