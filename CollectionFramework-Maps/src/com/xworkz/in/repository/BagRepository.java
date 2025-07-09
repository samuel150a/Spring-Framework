package com.xworkz.in.repository;

import com.xworkz.in.dto.BagDto;

import java.util.Map;

public interface BagRepository {
    Map<BagDto,Map<Integer,String>> findAll();
}
