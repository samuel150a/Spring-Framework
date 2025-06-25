package com.xworkz.in.repository;

import com.xworkz.in.dto.FurnitureDto;

import java.util.ArrayList;
import java.util.Collection;

public class FurnitureRepositoryImple implements FurnitureRepository {

    public FurnitureRepositoryImple() {
        System.out.println("FurnitureRepository implementation constructor");
    }

    @Override
    public Collection<FurnitureDto> findAll() {
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

        Collection<FurnitureDto> collection = new ArrayList<>();
        collection.add(f1);
        collection.add(f2);
        collection.add(f3);
        collection.add(f4);
        collection.add(f5);
        collection.add(f6);
        collection.add(f7);
        collection.add(f8);
        collection.add(f9);
        collection.add(f10);

        return collection;
    }
}
