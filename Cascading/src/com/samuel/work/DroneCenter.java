package com.samuel.work;

public class DroneCenter {
    public DroneCenter() {
        System.out.println("Running the DroneCenter constructor");
    }

    public void show(Drone12 drone) {
        if (drone != null) {
            drone.fly();
            if (drone instanceof CameraDrone12) {
                CameraDrone12 ref = (CameraDrone12) drone;
                ref.recordVideo();
            } else {
                System.out.println("Drone12 is not an instance of CameraDrone12, cannot call cascaded method");
            }
        } else {
            System.out.println("Drone12 is null");
        }
    }
}
