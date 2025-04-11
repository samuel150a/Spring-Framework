package com.sam.task;

public class Alien extends Planet100 {
    public Alien() {
        System.out.println("Running in the Alien constructor");
    }

    @Override
    public void rotate() {
        System.out.println("Running in the overridden method rotate from Alien");
    }

    public void communicate() {
        System.out.println("Running in the public method communicate");
    }

    public void explore() {
        System.out.println("Running in the public method explore");
    }
}
