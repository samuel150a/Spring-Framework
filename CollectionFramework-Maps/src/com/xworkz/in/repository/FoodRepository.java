package com.xworkz.in.repository;

import com.xworkz.in.dto.FoodDto;

import java.util.List;
import java.util.Map;

public interface FoodRepository {
    Map<FoodDto, List<String>> findAll();
}
