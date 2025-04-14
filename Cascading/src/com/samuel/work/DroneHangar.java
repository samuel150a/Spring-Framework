package com.samuel.work;

public class
DroneHangar {
    public DroneHangar() {
        System.out.println("Running the DroneHangar constructor");
    }

    public void show(Drone21 drone) {
        if (drone != null) {
            drone.fly();
            if (drone instanceof SmartDrone21) {
                SmartDrone21 ref = (SmartDrone21) drone;
                ref.scanArea();
            } else {
                System.out.println("Drone21 is not an instance of SmartDrone21, cannot call cascaded method");
            }
        } else {
            System.out.println("Drone21 is null");
        }
    }
}
