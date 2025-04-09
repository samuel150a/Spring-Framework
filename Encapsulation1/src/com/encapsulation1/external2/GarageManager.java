package com.encapsulation1.external2;


import com.encapsulation1.internal2.Garage;

public class GarageManager {
    public void manageDisp() {
        Garage garage = new Garage();
        System.out.println("Nameis" + garage.getName());
        System.out.println("Locationis" + garage.getLocation());
        System.out.println("Capacityis" + garage.getCapacity());
        System.out.println("HasWashingServiceis" + garage.getHasWashingService());
        System.out.println("Owneris" + garage.getOwner());
    }
}