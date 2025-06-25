package com.xworkz.in.repository;

import com.xworkz.in.dto.FurnitureDto;
import java.util.Collection;

public interface FurnitureRepository {
    Collection<FurnitureDto> findAll();
}
