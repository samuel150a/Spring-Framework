package com.xworkz.in.runner;

import com.xworkz.in.dto.AirlinesDto;
import com.xworkz.in.repository.AirlinesRepository;
import com.xworkz.in.repository.AirlinesRepositoryImple;

import java.util.ArrayList;
import java.util.Collection;

public class AirlinesRunner {
    public static void main(String[] args) {
        AirlinesRepository airlinesRepository = new AirlinesRepositoryImple();
        Collection<AirlinesDto> collection = airlinesRepository.findAll();

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%5");

        if (collection.isEmpty()) {
            System.out.println("No airlines found.");
        } else {
            System.out.println("Airlines list is not empty.");
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%5");

        AirlinesDto newAirline = new AirlinesDto("Indigo", 35000, "Canada", "Kempegowda", true);
        Collection<AirlinesDto> newList = new ArrayList<>();
        newList.add(newAirline);

        collection.addAll(newList);
        System.out.println("After addAll:");
        for (AirlinesDto dto : collection) {
            System.out.println(dto);

        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%5");


        boolean containsAll = collection.containsAll(newList);
        System.out.println("Collection contains all from newList? " + containsAll);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%5");

        collection.removeAll(newList);
        System.out.println("After removeAll:");
        for (AirlinesDto dto : collection) {
            System.out.println(dto);

        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%5");


        AirlinesDto airline1 = new AirlinesDto("Air India", 60000, "Delhi", "Indira Gandhi", true);
        AirlinesDto airline2 = new AirlinesDto("Air India", 60000, "Delhi", "Indira Gandhi", true);

        if (airline1.equals(airline2)) {
            System.out.println("Both airline DTOs are equal.");

        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%5");


        collection.add(airline1);
        System.out.println("After adding one airline:");
        for (AirlinesDto dto : collection) {
            System.out.println(dto);

        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%5");


        collection.remove(airline1);
        System.out.println("After removing that airline:");
        for (AirlinesDto dto : collection) {
            System.out.println(dto);

        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%5");

    }
}
