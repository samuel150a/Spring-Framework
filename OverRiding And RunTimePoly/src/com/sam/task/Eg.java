package com.sam.task;

public class Eg extends Slipper69 {
    public Eg() {
        System.out.println("Running in the Eg constructor");
    }

    @Override
    public void wear() {
        System.out.println("Running in the overridden method wear from Eg");
    }

    public void clean() {
        System.out.println("Running in the public method clean");
    }

    public void remove() {
        System.out.println("Running in the public method remove");
    }
}
