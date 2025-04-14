package com.samuel.work;

public class Mug73 extends Cup73 {
    public Mug73() {
        System.out.println("Running in the Mug73 constructor");
    }

    @Override
    public void drink() {
        System.out.println("Running public method drink by child class");
    }

    public void handle() {
        System.out.println("Running in public method handle");
    }
}
