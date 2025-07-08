package com.xworkz.in.repository;

import com.xworkz.in.dto.ProductDto;
import com.xworkz.in.dto.VendorDto;

import java.util.Map;

public interface ProductVendorRepository {
    Map<ProductDto, VendorDto> findAll();
}
