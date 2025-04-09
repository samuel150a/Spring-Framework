package com.encapsulation.external;

import com.encapsulation.internal.Gym;

public class GymManager {
    public void manageDisp() {
        Gym gym = new Gym();
        System.out.println("GymNameis" + gym.getName());
        System.out.println("GymLocationis" + gym.getLocation());
        System.out.println("NumberOfEquipmentsis" + gym.getNumberOfEquipments());
        System.out.println("HasTraineris" + gym.getHasTrainer());
        System.out.println("OwnerNameis" + gym.getOwnerName());
    }
}