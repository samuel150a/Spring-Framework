package com.sam.task;

public class Oxygen extends Tree43 {
    public Oxygen() {
        System.out.println("Running in the Oxygen constructor");
    }

    @Override
    public void grow() {
        System.out.println("Running in the public method grow after implementation");
    }

    public void release() {
        System.out.println("Running in the public method release");
    }

    public void purifyAir() {
        System.out.println("Running in the public method purifyAir");
    }
}
