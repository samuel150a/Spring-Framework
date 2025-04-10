package com.sam.task;

public class Seats extends Passengers23 {
    public Seats() {
        System.out.println("Running in the Seats constructor");
    }

    @Override
    public void travel() {
        System.out.println("Running in the public method travel after implementation");
    }

    public void book() {
        System.out.println("Running in the public method book");
    }

    public void adjust() {
        System.out.println("Running in the public method adjust");
    }
}
