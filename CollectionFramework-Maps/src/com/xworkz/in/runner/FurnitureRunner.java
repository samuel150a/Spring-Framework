package com.xworkz.in.runner;

import com.xworkz.in.dto.FurnitureDto;
import com.xworkz.in.repository.FurnitureRepository;
import com.xworkz.in.repository.FurnitureRepositoryImple;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class FurnitureRunner {

    public static void main(String[] args) {

        FurnitureRepository furnitureRepository = new FurnitureRepositoryImple();
        Map<Integer,FurnitureDto> map = furnitureRepository.findAll();

        System.out.println("Wooden Furniture List:");


        System.out.println("=========================================");



        System.out.println("Create");
        System.out.println(map);

        }
    }

