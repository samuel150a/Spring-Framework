package com.encapsulation1.internal2;

public class GarageTester {

    public void garageDisp() {
        Garage garage = new Garage();
        System.out.println("Nameis" + garage.getName());
        System.out.println("Locationis" + garage.getLocation());
        System.out.println("Capacityis" + garage.getCapacity());
        System.out.println("HasWashingServiceis" + garage.getHasWashingService());
        System.out.println("Owneris" + garage.getOwner());

        garage.setName("Elite Garage");
        garage.setLocation("Bangalore");
        garage.setCapacity(35);
        garage.setHasWashingService(false);
        garage.setOwner("Suresh");

        System.out.println("UpdatedNameis" + garage.getName());
        System.out.println("UpdatedLocationis" + garage.getLocation());
        System.out.println("UpdatedCapacityis" + garage.getCapacity());
        System.out.println("UpdatedHasWashingServiceis" + garage.getHasWashingService());
        System.out.println("UpdatedOwneris" + garage.getOwner());
    }
}


