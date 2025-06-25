package com.xworkz.in.repository;

import com.xworkz.in.dto.LaptopDto;

import java.util.Collection;

public interface LaptopRepository {
    Collection<LaptopDto> findAll();
}
