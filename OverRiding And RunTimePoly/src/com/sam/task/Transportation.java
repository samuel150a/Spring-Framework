package com.sam.task;

public class Transportation extends Road35 {
    public Transportation() {
        System.out.println("Running in the Transportation constructor");
    }

    @Override
    public void connectPlaces() {
        System.out.println("Running in the public method connectPlaces after implementation");
    }

    public void moveVehicles() {
        System.out.println("Running in the public method moveVehicles");
    }

    public void carryPeople() {
        System.out.println("Running in the public method carryPeople");
    }
}
