package com.xworkz.in.repository;

import com.xworkz.in.dto.BrandDto;
import com.xworkz.in.dto.ComputerDto;

import java.util.Map;

public interface ComputerBrandRepository
{

    Map<ComputerDto, BrandDto> findAll();
}
