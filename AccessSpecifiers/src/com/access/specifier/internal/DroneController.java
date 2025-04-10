package com.access.specifier.internal;

public class DroneController {

    public DroneController() {
        System.out.println("DroneController constructor is running");
    }

    public void accessDrone() {
        Drone drone = new Drone();
        drone.fly();
        drone.hover();
    }
}
