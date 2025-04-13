package com.samuel.work;

public class CameraDrone12 extends Drone12 {
    public CameraDrone12() {
        System.out.println("Running in the CameraDrone12 constructor");
    }

    @Override
    public void fly() {
        System.out.println("Running public method fly by child class");
    }

    public void recordVideo() {
        System.out.println("Running in public method recordVideo");
    }
}
