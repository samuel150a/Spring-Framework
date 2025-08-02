package com.xworkz.interiorwork.service;

import com.xworkz.interiorwork.entity.InteriorEntity;
import com.xworkz.interiorwork.repository.InteriorRepo;
import com.xworkz.interiorwork.repository.InteriorRepoImple;
import com.xworkz.interiorwork.runner.InteriorRunner;

import static sun.plugin2.liveconnect.ArgumentHelper.validate;

public class InteriorServiceImple implements InteriorService{
    InteriorRepo interiorRepo = new InteriorRepoImple();


    public InteriorServiceImple()
    {
        System.out.println("running in InteriorServiceImple constructor");
    }

    @Override
    public InteriorEntity validation(InteriorEntity en) {
        System.out.println("running in the validation method in InteriorServiceImple class ");

        if (en != null) {
            System.out.println("Data is valid");

            if ("office".equals(en.getVariety())) {
                System.out.println("Variety is office");
            } else {
                System.out.println("vareity is not office");

            }

            if (en.getPrice() < 4000) {
                System.out.println("Perfect cost");
            } else {
                System.out.println("not available");
                return null;
            }

            interiorRepo.savedInterior(en);
        } else {
            System.out.println("Data is not null");
            return null;
        }

        return null;

    }
    @Override
    public void savedInterior(InteriorEntity entity) {
        System.out.println("Running in savedInterior in serviceimple");
        validation( entity);

    }

    @Override
    public InteriorEntity readInterior(InteriorEntity entity) {
        System.out.println("Running in readInterior in serviceimple");

        return interiorRepo.readInterior(entity);

    }

    @Override
    public InteriorEntity updateInterior(InteriorEntity entity) {
        System.out.println("Running in updateInterior in serviceimple");
        return interiorRepo.updateInterior( entity);
    }

    @Override
    public InteriorEntity deleteInterior(InteriorEntity entity) {
        System.out.println("Running in deleteInterior in serviceimple");
        return interiorRepo.deleteInterior(entity);
    }
}