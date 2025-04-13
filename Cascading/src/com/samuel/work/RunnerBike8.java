package com.samuel.work;

public class RunnerBike8 {
    public static void main(String[] args) {
        Bike8 bike = new Bike8();
        bike.start(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Bike8 sportsBike = new SportsBike8();
        sportsBike.start(); // RUNTIME POLYMORPHISM

        SportsBike8 sb8 = new SportsBike8();
        sb8.start(); // NORMALLY ACCESSING CHILD CLASS METHOD
        sb8.boostMode();

        BikeShowroom showroom = new BikeShowroom();
        showroom.show(bike);
        showroom.show(sb8);
    }
}
