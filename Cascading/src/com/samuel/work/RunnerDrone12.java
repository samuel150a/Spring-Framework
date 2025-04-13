package com.samuel.work;

public class RunnerDrone12 {
    public static void main(String[] args) {
        Drone12 drone = new Drone12();
        drone.fly(); // NORMALLY ACCESSING PARENT CLASS METHOD

        Drone12 cameraDrone = new CameraDrone12();
        cameraDrone.fly(); // RUNTIME POLYMORPHISM

        CameraDrone12 cd12 = new CameraDrone12();
        cd12.fly(); // NORMALLY ACCESSING CHILD CLASS METHOD
        cd12.recordVideo();

        DroneCenter center = new DroneCenter();
        center.show(drone);
        center.show(cd12);
    }
}
