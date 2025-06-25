package com.xworkz.in.repository;

import com.xworkz.in.dto.LaptopDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class LaptopRepositoryImple implements LaptopRepository{

    public LaptopRepositoryImple()
    {
        System.out.println("running in the LaptopRepositoryImple constructor ");
    }

    @Override
    public Collection<LaptopDto> findAll() {
        System.out.println("running in the findAll method  ");



        LaptopDto laptopDto1 = new LaptopDto(45000, "HP", "Silver", true, "Intel");
        LaptopDto laptopDto2 = new LaptopDto(60000, "Dell", "Black", true, "AMD Ryzen 5");
        LaptopDto laptopDto3 = new LaptopDto(52000, "Lenovo", "Gray", false, "Intel i5");
        LaptopDto laptopDto4 = new LaptopDto(75000, "Asus", "Blue", true, "Intel i7");
        LaptopDto laptopDto5 = new LaptopDto(39000, "Acer", "White", false, "Intel i3");
        LaptopDto laptopDto6 = new LaptopDto(88000, "Apple", "Space Gray", true, "M1");
        LaptopDto laptopDto7 = new LaptopDto(47000, "MSI", "Black", true, "AMD Ryzen 7");
        LaptopDto laptopDto8 = new LaptopDto(68000, "Samsung", "Silver", true, "Intel i5");
        LaptopDto laptopDto9 = new LaptopDto(33000, "iBall", "Red", false, "Intel Celeron");
        LaptopDto laptopDto10 = new LaptopDto(99000, "Microsoft", "Platinum", true, "Intel i9");

        Collection<LaptopDto> collection =new ArrayList<>();
        collection.add(laptopDto1);
        collection.add(laptopDto2);
        collection.add(laptopDto3);
        collection.add(laptopDto4);
        collection.add(laptopDto5);
        collection.add(laptopDto6);
        collection.add(laptopDto7);
        collection.add(laptopDto8);
        collection.add(laptopDto9);
        collection.add(laptopDto10);

        return  collection;


    }
}
