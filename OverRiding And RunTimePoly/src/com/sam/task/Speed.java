package com.sam.task;

public class Speed extends Engine49 {
    public Speed() {
        System.out.println("Running in the Speed constructor");
    }

    @Override
    public void start() {
        System.out.println("Running in the public method start after implementation");
    }

    public void accelerate() {
        System.out.println("Running in the public method accelerate");
    }

    public void boost() {
        System.out.println("Running in the public method boost");
    }
}
