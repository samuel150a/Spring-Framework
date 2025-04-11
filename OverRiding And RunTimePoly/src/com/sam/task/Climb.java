package com.sam.task;

public class Climb extends Mountain86 {
    public Climb() {
        System.out.println("Running in the Climb constructor");
    }

    @Override
    public void standTall() {
        System.out.println("Running in the overridden method standTall from Climb");
    }

    public void startClimbing() {
        System.out.println("Running in the public method startClimbing");
    }

    public void reachSummit() {
        System.out.println("Running in the public method reachSummit");
    }
}
