package com.xworkz.in.runner;

import com.xworkz.in.dto.ProductDto;
import com.xworkz.in.dto.VendorDto;
import com.xworkz.in.repository.ProductVendorRepository;
import com.xworkz.in.repository.ProductVendorRepositoryImple;

import java.util.Map;

public class ProductVendorRepositoryRunner {

    public static void main(String[] args) {
        ProductVendorRepository productVendorRepository=new ProductVendorRepositoryImple();

        Map<ProductDto, VendorDto> map =productVendorRepository.findAll();

        map.keySet().forEach(System.out::println);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%555");
        map.values().forEach(System.out::println);

    }
}
