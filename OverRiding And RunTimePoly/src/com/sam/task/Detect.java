package com.sam.task;

public class Detect extends Sensor59 {
    public Detect() {
        System.out.println("Running in the Detect constructor");
    }

    @Override
    public void sense() {
        System.out.println("Running in the overridden method sense from Detect");
    }

    public void detectMotion() {
        System.out.println("Running in the public method detectMotion");
    }

    public void detectHeat() {
        System.out.println("Running in the public method detectHeat");
    }
}
