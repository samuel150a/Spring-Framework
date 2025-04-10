package com.sam.task;

public class Fish extends Sea21 {
    public Fish() {
        System.out.println("Running in the Fish constructor");
    }

    @Override
    public void flow() {
        System.out.println("Running in the public method flow after implementation");
    }

    public void swim() {
        System.out.println("Running in the public method swim");
    }

    public void breathe() {
        System.out.println("Running in the public method breathe");
    }
}
