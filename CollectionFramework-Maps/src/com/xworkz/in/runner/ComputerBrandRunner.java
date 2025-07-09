package com.xworkz.in.runner;

import com.xworkz.in.dto.BrandDto;
import com.xworkz.in.dto.ComputerDto;
import com.xworkz.in.repository.ComputerBrandRepository;
import com.xworkz.in.repository.ComputerBrandRepositoryImple;

import java.util.Map;

public class ComputerBrandRunner
{
    public static void main(String[] args) {
        ComputerBrandRepository computerBrandRepository=new ComputerBrandRepositoryImple();
        Map<ComputerDto, BrandDto> map=computerBrandRepository.findAll();
        map.keySet().forEach(System.out::println);
        System.out.println("##########################33");
        map.values().forEach(System.out::println);
    }
}
