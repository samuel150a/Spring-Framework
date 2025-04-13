package com.samuel.work;

public class SportsBike8 extends Bike8 {
    public SportsBike8() {
        System.out.println("Running in the SportsBike8 constructor");
    }

    @Override
    public void start() {
        System.out.println("Running public method start by child class");
    }

    public void boostMode() {
        System.out.println("Running in public method boostMode");
    }
}
