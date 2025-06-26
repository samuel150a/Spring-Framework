package com.xworkz.in.repository;

import com.xworkz.in.dto.AirlinesDto;

import java.util.Collection;

public interface AirlinesRepository {

    Collection<AirlinesDto> findAll();
}
