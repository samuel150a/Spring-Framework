package com.xworkz.in.repository;

import com.xworkz.in.dto.FurnitureDto;

import java.util.HashMap;
import java.util.Map;

public class FurnitureRepositoryImple implements FurnitureRepository {

    public FurnitureRepositoryImple() {
        System.out.println("FurnitureRepository implementation constructor");
    }

    @Override
    public Map<Integer,FurnitureDto> findAll() {
        System.out.println("findAll method in FurnitureRepository implementation");

        FurnitureDto f1 = new FurnitureDto("Dining Table", "Teak Wood", 25000, true, "Dining");
        FurnitureDto f2 = new FurnitureDto("Office Chair", "Plastic", 4500, false, "Office");
        FurnitureDto f3 = new FurnitureDto("Sofa", "Leather", 30000, false, "Living Room");
        FurnitureDto f4 = new FurnitureDto("Bookshelf", "MDF", 7000, true, "Study");
        FurnitureDto f5 = new FurnitureDto("Wardrobe", "Plywood", 18000, true, "Bedroom");
        FurnitureDto f6 = new FurnitureDto("Coffee Table", "Glass", 6000, false, "Living Room");
        FurnitureDto f7 = new FurnitureDto("TV Unit", "Engineered Wood", 9000, true, "Entertainment");
        FurnitureDto f8 = new FurnitureDto("Bed", "Sheesham Wood", 35000, true, "Bedroom");
        FurnitureDto f9 = new FurnitureDto("Recliner", "Fabric", 20000, false, "Living Room");
        FurnitureDto f10 = new FurnitureDto("Study Table", "Pine Wood", 10000, true, "Study");
        System.out.println("CRUD Operations");

        Map<Integer,FurnitureDto> map = new HashMap();
        map.put(1,f1);
        map.put(2,f2);
        map.put(3,f3);
        map.put(4,f4);
        map.put(5,f5);
        map.put(6,f6);
        map.put(7,f7);
        map.put(8,f8);
        map.put(9,f9);
        map.put(10,f10);

        System.out.println("Read");
        System.out.println("map contains the key 10: "+map.containsKey(10));

        System.out.println(map.get(10));
        System.out.println("Update Operation");
        FurnitureDto furniture = map.get(10);

        furniture.setName("sofa");
        furniture.setMaterial("Engineered Wood");
        furniture.setPrice(9000);

        furniture.setCategory("Entertainment");
        System.out.println(map.get(10));

        System.out.println("remove Operation");
        map.remove(10);
        System.out.println("After Removing "+map);

        System.out.println("**************************************************************************************************************");
        System.out.println("Some Additional operation");
        System.out.println("Size "+map.size());
        System.out.println("replace : "+map.replace(8,f1));
        System.out.println("Contains value : "+map.containsValue(f3));
        return map;
    }
}
