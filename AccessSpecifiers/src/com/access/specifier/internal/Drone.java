package com.access.specifier.internal;

public class Drone {

    public Drone() {
        System.out.println("Drone constructor is running");
    }

    public void fly() {
        System.out.println("public method fly is running");
    }

    void hover() {
        System.out.println("default method hover is running");
    }

    private void shutdown() {
        System.out.println("private method shutdown is running");
    }
}

