package com.sam.task;

public class Walk extends Leg52 {
    public Walk() {
        System.out.println("Running in the Walk constructor");
    }

    @Override
    public void move() {
        System.out.println("Running in the overridden method move from Walk");
    }

    public void step() {
        System.out.println("Running in the public method step");
    }

    public void run() {
        System.out.println("Running in the public method run");
    }
}
