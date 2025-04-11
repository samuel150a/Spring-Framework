package com.sam.task;

public class Write extends Pen47 {
    public Write() {
        System.out.println("Running in the Write constructor");
    }

    @Override
    public void click() {
        System.out.println("Running in the public method click after implementation");
    }

    public void draw() {
        System.out.println("Running in the public method draw");
    }

    public void noteDown() {
        System.out.println("Running in the public method noteDown");
    }
}
