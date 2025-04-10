package com.sam.task;

public class Life extends Helmet13 {
    public Life() {
        System.out.println("Running in the Life constructor");
    }

    @Override
    public void protectHead() {
        System.out.println("Running in the public method protectHead after implementation");
    }

    public void safeRide() {
        System.out.println("Running in the public method safeRide");
    }

    public void saveLife() {
        System.out.println("Running in the public method saveLife");
    }
}
