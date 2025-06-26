package com.xworkz.in.repository;

import com.xworkz.in.dto.AirlinesDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class AirlinesRepositoryImple implements AirlinesRepository{
    public AirlinesRepositoryImple()
    {
        System.out.println("running in the AirlinesRepositoryImple constructor");
    }

    @Override
    public Collection<AirlinesDto> findAll() {
        System.out.println("running in the findAll method");

        AirlinesDto airlinesDto1 = new AirlinesDto("Indigo", 35000, "Canada", "Kempegowda", true);
        AirlinesDto airlinesDto2 = new AirlinesDto("Air India", 45000, "USA", "Rajiv Gandhi", true);
        AirlinesDto airlinesDto3 = new AirlinesDto("SpiceJet", 28000, "Dubai", "Chhatrapati Shivaji", false);
        AirlinesDto airlinesDto4 = new AirlinesDto("Vistara", 39000, "Germany", "Indira Gandhi", true);
        AirlinesDto airlinesDto5 = new AirlinesDto("Go First", 25000, "Thailand", "Kempegowda", false);
        AirlinesDto airlinesDto6 = new AirlinesDto("AirAsia", 32000, "Singapore", "Chennai", true);
        AirlinesDto airlinesDto7 = new AirlinesDto("Qatar Airways", 60000, "Qatar", "Rajiv Gandhi", true);
        AirlinesDto airlinesDto8 = new AirlinesDto("Lufthansa", 70000, "Germany", "Indira Gandhi", true);
        AirlinesDto airlinesDto9 = new AirlinesDto("Emirates", 80000, "UAE", "Chhatrapati Shivaji", true);
        AirlinesDto airlinesDto10 = new AirlinesDto("British Airways", 75000, "UK", "Kempegowda", false);

        Collection<AirlinesDto>collection=new ArrayList<>();
        collection.add(airlinesDto1);
        collection.add(airlinesDto2);
        collection.add(airlinesDto3);
        collection.add(airlinesDto4);
        collection.add(airlinesDto5);
        collection.add(airlinesDto6);
        collection.add(airlinesDto7);
        collection.add(airlinesDto8);
        collection.add(airlinesDto9);
        collection.add(airlinesDto10);

return collection;

    }
}
