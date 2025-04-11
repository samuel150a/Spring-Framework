package com.sam.task;

public class Coding extends Laptop44 {
    public Coding() {
        System.out.println("Running in the Coding constructor");
    }

    @Override
    public void powerOn() {
        System.out.println("Running in the public method powerOn after implementation");
    }

    public void writeCode() {
        System.out.println("Running in the public method writeCode");
    }

    public void compile() {
        System.out.println("Running in the public method compile");
    }
}
