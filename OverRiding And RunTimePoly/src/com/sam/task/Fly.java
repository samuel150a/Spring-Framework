package com.sam.task;

public class Fly extends Drone58 {
    public Fly() {
        System.out.println("Running in the Fly constructor");
    }

    @Override
    public void navigate() {
        System.out.println("Running in the overridden method navigate from Fly");
    }

    public void takeOff() {
        System.out.println("Running in the public method takeOff");
    }

    public void land() {
        System.out.println("Running in the public method land");
    }
}
