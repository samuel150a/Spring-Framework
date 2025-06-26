package com.xworkz.in.repository;

import com.xworkz.in.dto.ApplianceDto;
import com.xworkz.in.dto.ShirtDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ShirtRepositoryImple implements ShirtRepository{
    public ShirtRepositoryImple(){
        System.out.println("Running in the ShirtRepositoryImple constructor");
    }





    @Override
    public Collection<ShirtDto> findAll() {

        System.out.println("findAll methond in ShirtRepositoryImple ");
        ShirtDto shirtDto1 = new ShirtDto(1, "PanAmerica", 760, "formal", "white");
        ShirtDto shirtDto2 = new ShirtDto(2, "Peter England", 850, "casual", "blue");
        ShirtDto shirtDto3 = new ShirtDto(3, "Louis Philippe", 1200, "formal", "black");
        ShirtDto shirtDto4 = new ShirtDto(4, "Allen Solly", 950, "casual", "red");
        ShirtDto shirtDto5 = new ShirtDto(5, "Van Heusen", 1300, "formal", "light blue");
        ShirtDto shirtDto6 = new ShirtDto(6, "Zara", 1500, "party", "grey");
        ShirtDto shirtDto7 = new ShirtDto(7, "H&M", 990, "casual", "green");
        ShirtDto shirtDto8 = new ShirtDto(8, "Arrow", 1100, "formal", "navy blue");
        ShirtDto shirtDto9 = new ShirtDto(9, "Mufti", 870, "casual", "brown");
        ShirtDto shirtDto10 = new ShirtDto(10, "Levi's", 1050, "denim", "blue");

        Collection<ShirtDto> collection=new ArrayList<>();
        collection.add(shirtDto1);
        collection.add(shirtDto2);
        collection.add(shirtDto3);
        collection.add(shirtDto4);
        collection.add(shirtDto5);
        collection.add(shirtDto6);
        collection.add(shirtDto7);
        collection.add(shirtDto8);
        collection.add(shirtDto9);
        collection.add(shirtDto10);
        return collection;


    }
}

