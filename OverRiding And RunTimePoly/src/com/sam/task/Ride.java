package com.sam.task;

public class Ride extends Bike75 {
    public Ride() {
        System.out.println("Running in the Ride constructor");
    }

    @Override
    public void start() {
        System.out.println("Running in the overridden method start from Ride");
    }

    public void accelerate() {
        System.out.println("Running in the public method accelerate");
    }

    public void brake() {
        System.out.println("Running in the public method brake");
    }
}
