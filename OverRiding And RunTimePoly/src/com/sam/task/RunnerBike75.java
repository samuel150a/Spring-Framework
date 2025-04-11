package com.sam.task;

public class RunnerBike75 {
    public static void main(String[] args) {
        Bike75 bike = new Bike75();
        bike.start();

        Bike75 b = new Ride();
        b.start();

        Ride ride = new Ride();
        ride.accelerate();
        ride.brake();
    }
}
