package com.samuel.work;

public class BikeShowroom {
    public BikeShowroom() {
        System.out.println("Running the BikeShowroom constructor");
    }

    public void show(Bike8 bike) {
        if (bike != null) {
            bike.start();
            if (bike instanceof SportsBike8) {
                SportsBike8 ref = (SportsBike8) bike;
                ref.boostMode();
            } else {
                System.out.println("Bike8 is not an instance of SportsBike8, cannot call cascaded method");
            }
        } else {
            System.out.println("Bike8 is null");
        }
    }
}
