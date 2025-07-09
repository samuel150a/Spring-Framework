package com.xworkz.in.runner;

import com.xworkz.in.dto.ProductDto;
import com.xworkz.in.dto.VendorDto;
import com.xworkz.in.repository.ProductVendorRepository;
import com.xworkz.in.repository.ProductVendorRepositoryImple;

import java.util.Map;
import java.util.Set;

public class ProductVendorRepositoryRunner {

    public static void main(String[] args) {
        ProductVendorRepository productVendorRepository=new ProductVendorRepositoryImple();

        Map<ProductDto, VendorDto> map =productVendorRepository.findAll();

        /*map.keySet().forEach(System.out::println);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%555");
        map.values().forEach(System.out::println);*/

        Set<Map.Entry<ProductDto,VendorDto>> entrySet=map.entrySet();
        entrySet.forEach(e->{
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        });

    }
}
