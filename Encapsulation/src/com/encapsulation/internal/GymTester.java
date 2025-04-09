package com.encapsulation.internal;



public class GymTester {
    public void gymDisp() {
        Gym gym = new Gym();
        System.out.println("GymNameis" + gym.getName());
        System.out.println("GymLocationis" + gym.getLocation());
        System.out.println("NumberOfEquipmentsis" + gym.getNumberOfEquipments());
        System.out.println("HasTraineris" + gym.getHasTrainer());
        System.out.println("OwnerNameis" + gym.getOwnerName());

        gym.setName("MuscleHouse");
        gym.setLocation(" Jai Nagar");
        gym.setNumberOfEquipments(50);
        gym.setHasTrainer(false);
        gym.setOwnerName("amos");

        System.out.println("UpdatedGymNameis" + gym.getName());
        System.out.println("UpdatedGymLocationis" + gym.getLocation());
        System.out.println("UpdatedNumberOfEquipmentsis" + gym.getNumberOfEquipments());
        System.out.println("UpdatedHasTraineris" + gym.getHasTrainer());
        System.out.println("UpdatedOwnerNameis" + gym.getOwnerName());
    }
}