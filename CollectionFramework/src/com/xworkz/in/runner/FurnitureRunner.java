package com.xworkz.in.runner;

import com.xworkz.in.dto.FurnitureDto;
import com.xworkz.in.repository.FurnitureRepository;
import com.xworkz.in.repository.FurnitureRepositoryImple;

import java.util.Collection;
import java.util.Iterator;

public class FurnitureRunner {

    public static void main(String[] args) {

        FurnitureRepository furnitureRepository = new FurnitureRepositoryImple();
        Collection<FurnitureDto> collection = furnitureRepository.findAll();

        System.out.println("Wooden Furniture List:");
        for (FurnitureDto furniture : collection) {
            if (furniture.isWooden()) {
                System.out.println("Furniture Name: " + furniture.getName());
                System.out.println("Material: " + furniture.getMaterial());
            }
        }

        System.out.println("=========================================");

        Iterator<FurnitureDto> iterator = collection.iterator();
        while (iterator.hasNext()) {
            FurnitureDto furniture = iterator.next();
            System.out.println("Furniture Name: " + furniture.getName());
            System.out.println("Material: " + furniture.getMaterial());
            System.out.println("Price: " + furniture.getPrice());
            System.out.println("Is Wooden: " + furniture.isWooden());
            System.out.println("Category: " + furniture.getCategory());
            System.out.println("----------------------------------------");
        }
    }
}
