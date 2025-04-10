package com.access.specifier.external;

import com.access.specifier.internal.Drone;

public class DroneService {

    public DroneService() {
        System.out.println("DroneService constructor is running");
    }

    public void externalAccess() {
        Drone drone = new Drone();
        drone.fly();
    }
}
