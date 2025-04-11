package com.sam.task;

public class Slidder extends Park73 {
    public Slidder() {
        System.out.println("Running in the Slidder constructor");
    }

    @Override
    public void openGate() {
        System.out.println("Running in the overridden method openGate from Slidder");
    }

    public void slideDown() {
        System.out.println("Running in the public method slideDown");
    }

    public void climbLadder() {
        System.out.println("Running in the public method climbLadder");
    }
}
