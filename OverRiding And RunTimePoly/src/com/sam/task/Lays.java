package com.sam.task;

public class Lays extends Potato25 {
    public Lays() {
        System.out.println("Running in the Lays constructor");
    }

    @Override
    public void grow() {
        System.out.println("Running in the public method grow after implementation");
    }

    public void pack() {
        System.out.println("Running in the public method pack");
    }

    public void flavor() {
        System.out.println("Running in the public method flavor");
    }
}
