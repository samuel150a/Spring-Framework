package com.samuel.work;

public class SmartDrone21 extends Drone21 {
    public SmartDrone21() {
        System.out.println("Running in the SmartDrone21 constructor");
    }

    @Override
    public void fly() {
        System.out.println("Running public method fly by child class");
    }

    public void scanArea() {
        System.out.println("Running in public method scanArea");
    }
}
