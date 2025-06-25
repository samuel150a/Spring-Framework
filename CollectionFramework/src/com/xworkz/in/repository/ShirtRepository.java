package com.xworkz.in.repository;

import com.xworkz.in.dto.ShirtDto;

import java.util.Collection;

public interface ShirtRepository  {
    Collection<ShirtDto> findAll();

}
