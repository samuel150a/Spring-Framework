package com.sam.task;

public class Spin extends Fan81 {
    public Spin() {
        System.out.println("Running in the Spin constructor");
    }

    @Override
    public void switchOn() {
        System.out.println("Running in the overridden method switchOn from Spin");
    }

    public void setSpeed() {
        System.out.println("Running in the public method setSpeed");
    }

    public void oscillate() {
        System.out.println("Running in the public method oscillate");
    }
}
