package com.sam.task;

public class Thinking extends Brain39 {
    public Thinking() {
        System.out.println("Running in the Thinking constructor");
    }

    @Override
    public void process() {
        System.out.println("Running in the public method process after implementation");
    }

    public void analyze() {
        System.out.println("Running in the public method analyze");
    }

    public void imagine() {
        System.out.println("Running in the public method imagine");
    }
}
