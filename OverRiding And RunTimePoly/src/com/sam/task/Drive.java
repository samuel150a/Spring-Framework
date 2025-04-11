package com.sam.task;

public class Drive extends Engine56 {
    public Drive() {
        System.out.println("Running in the Drive constructor");
    }

    @Override
    public void start() {
        System.out.println("Running in the overridden method start from Drive");
    }

    public void accelerate() {
        System.out.println("Running in the public method accelerate");
    }

    public void brake() {
        System.out.println("Running in the public method brake");
    }
}
