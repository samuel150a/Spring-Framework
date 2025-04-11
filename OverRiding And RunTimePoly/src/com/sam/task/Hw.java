package com.sam.task;

public class Hw extends Book36 {
    public Hw() {
        System.out.println("Running in the Hw constructor");
    }

    @Override
    public void open() {
        System.out.println("Running in the public method open after implementation");
    }

    public void write() {
        System.out.println("Running in the public method write");
    }

    public void submit() {
        System.out.println("Running in the public method submit");
    }
}
