package com.xworkz.in.repository;

import com.xworkz.in.dto.ProductInfoDto;

import java.util.Collection;

public interface ProductInfoRepository {
    Collection<ProductInfoDto> findAll();

}
