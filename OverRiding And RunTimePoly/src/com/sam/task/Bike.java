package com.sam.task;

public class Bike extends Owner27 {
    public Bike() {
        System.out.println("Running in the Bike constructor");
    }

    @Override
    public void ride() {
        System.out.println("Running in the public method ride after implementation");
    }

    public void service() {
        System.out.println("Running in the public method service");
    }

    public void refuel() {
        System.out.println("Running in the public method refuel");
    }
}
