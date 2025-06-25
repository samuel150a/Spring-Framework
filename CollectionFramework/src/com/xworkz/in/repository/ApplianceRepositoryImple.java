package com.xworkz.in.repository;

import com.xworkz.in.dto.ApplianceDto;

import java.util.ArrayList;
import java.util.Collection;

public class ApplianceRepositoryImple implements ApplianceRepository
{

    public ApplianceRepositoryImple()
    {
        System.out.println("ApplianceRepository implementation constructor");
    }

    @Override
    public Collection<ApplianceDto> findAll() {
        System.out.println("findAll method in ApplianceRepository implementation");

        ApplianceDto applianceDto1 = new ApplianceDto("Room Heater", "Usha", 6000, true, "Heating");
        ApplianceDto applianceDto2 = new ApplianceDto("Induction Cooktop", "Philips", 3500, true, "Kitchen");
        ApplianceDto applianceDto3 = new ApplianceDto("Mixer Grinder", "Preethi", 4800, false, "Kitchen");
        ApplianceDto applianceDto4 = new ApplianceDto("Hair Dryer", "Panasonic", 2200, true, "Personal Care");
        ApplianceDto applianceDto5 = new ApplianceDto("Electric Kettle", "Bajaj", 1800, true, "Kitchen");
        ApplianceDto applianceDto6 = new ApplianceDto("Toaster", "Morphy Richards", 2400, false, "Kitchen");
        ApplianceDto applianceDto7 = new ApplianceDto("Smart TV", "Sony", 55000, true, "Entertainment");
        ApplianceDto applianceDto8 = new ApplianceDto("Air Purifier", "Philips", 15000, true, "Health");
        ApplianceDto applianceDto9 = new ApplianceDto("Coffee Maker", "Nespresso", 12000, false, "Kitchen");
        ApplianceDto applianceDto10 = new ApplianceDto("Electric Iron", "Orient", 2000, true, "Home");


        Collection<ApplianceDto> collection=new ArrayList<>();
        collection.add(applianceDto1);
        collection.add(applianceDto2);
        collection.add(applianceDto3);
        collection.add(applianceDto4);
        collection.add(applianceDto5);
        collection.add(applianceDto6);
        collection.add(applianceDto7);
        collection.add(applianceDto8);
        collection.add(applianceDto9);
        collection.add(applianceDto10);

        return collection;
    }
}