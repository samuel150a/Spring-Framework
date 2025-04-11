package com.sam.task;

public class Car extends Garage98 {
    public Car() {
        System.out.println("Running in the Car constructor");
    }

    @Override
    public void park() {
        System.out.println("Running in the overridden method park from Car");
    }

    public void startEngine() {
        System.out.println("Running in the public method startEngine");
    }

    public void drive() {
        System.out.println("Running in the public method drive");
    }
}
