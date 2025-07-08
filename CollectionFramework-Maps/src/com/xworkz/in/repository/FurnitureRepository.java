package com.xworkz.in.repository;

import com.xworkz.in.dto.FurnitureDto;
import java.util.Map;

public interface FurnitureRepository {
    Map<Integer,FurnitureDto> findAll();
}
