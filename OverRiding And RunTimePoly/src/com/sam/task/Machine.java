package com.sam.task;

public class Machine extends Factory95 {
    public Machine() {
        System.out.println("Running in the Machine constructor");
    }

    @Override
    public void produce() {
        System.out.println("Running in the overridden method produce from Machine");
    }

    public void startMachine() {
        System.out.println("Running in the public method startMachine");
    }

    public void stopMachine() {
        System.out.println("Running in the public method stopMachine");
    }
}
