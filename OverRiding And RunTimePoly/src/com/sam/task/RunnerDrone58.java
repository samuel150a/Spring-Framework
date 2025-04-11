package com.sam.task;

public class RunnerDrone58 {
    public static void main(String[] args) {
        Drone58 drone = new Drone58();
        drone.navigate();

        Drone58 d = new Fly();
        d.navigate();

        Fly fly = new Fly();
        fly.takeOff();
        fly.land();
    }
}
