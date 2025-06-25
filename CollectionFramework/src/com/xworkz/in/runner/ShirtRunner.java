package com.xworkz.in.runner;

import com.xworkz.in.dto.ApplianceDto;
import com.xworkz.in.dto.ShirtDto;
import com.xworkz.in.repository.ShirtRepository;
import com.xworkz.in.repository.ShirtRepositoryImple;

import java.util.Collection;
import java.util.Iterator;

public class ShirtRunner {
    public static void main(String[] args) {
        ShirtRepository shirtRepository = new ShirtRepositoryImple();
        Collection<ShirtDto> collection = shirtRepository.findAll();
        System.out.println("list");
        for (ShirtDto shirtDto : collection) {

            if (shirtDto.getPrice() > 300) {
                System.out.println("Brand: " + shirtDto.getBrand());
                System.out.println("Price: " + shirtDto.getPrice());

            }
        }
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        Iterator<ShirtDto> iterator = collection.iterator();
        while (iterator.hasNext()) {
            ShirtDto shirtDtos = iterator.next();
            System.out.println(" Size: " + shirtDtos.getSize());
            System.out.println("Brand: " + shirtDtos.getBrand());
            System.out.println("Price: " + shirtDtos.getPrice());
            System.out.println("Type: " + shirtDtos.getType());
            System.out.println("Color: " + shirtDtos.getColor());
            System.out.println("*********************************************************88");
        }

    } }

