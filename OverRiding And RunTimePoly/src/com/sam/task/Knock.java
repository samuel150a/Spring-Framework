package com.sam.task;

public class Knock extends Door77 {
    public Knock() {
        System.out.println("Running in the Knock constructor");
    }

    @Override
    public void close() {
        System.out.println("Running in the overridden method close from Knock");
    }

    public void knockDoor() {
        System.out.println("Running in the public method knockDoor");
    }

    public void openDoor() {
        System.out.println("Running in the public method openDoor");
    }
}
